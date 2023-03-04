package exc_functional.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * A class to generate some seasons and episodes.
 *
 * In a real application they would come from a database or api.
 */
public class SeasonProvider {
    private List<Season> seasons;
    private int nrOfSeasons;
    private int episodesPerSeason;

    public SeasonProvider(int nrOfSeasons, int episodesPerSeason) {
        this.nrOfSeasons = nrOfSeasons;
        this.episodesPerSeason = episodesPerSeason;
    }

    public List<Season> getSeasons() {
        if (seasons != null) {
            return seasons;
        }

        seasons = new ArrayList<>();

        IntStream.range(1, nrOfSeasons + 1).forEachOrdered(
                (seasonNr) -> {
                    List<Episode> seasonEpisodes = new ArrayList<>();
                    final String seasonName = "Season " + seasonNr;

                    IntStream.range(1, episodesPerSeason + 1).forEachOrdered(
                            (episodeNrInSeason) -> {
                                final int episodeNumber = (seasonNr - 1) * episodesPerSeason + episodeNrInSeason;
                                final String episodeName = "Episode number " + episodeNumber;
                                final String url = "https://awsomevideoservice.io/best-show/season/" + seasonNr +
                                        "/episode/" + episodeNumber;
                                seasonEpisodes.add(
                                        new Episode(
                                                episodeName,
                                                episodeNumber,
                                                new ArrayList<Video> (List.of(new Video[] {
                                                        new Video(episodeName + " full video", url, VideoType.EPISODE),
                                                        new Video(episodeName + " preview", url + "/preview", VideoType.PREVIEW),
                                                        new Video(episodeName + " clip", url + "/clip", VideoType.CLIP),
                                                }))
                                        )
                                );
                            }
                    );

                    seasons.add(new Season(seasonName, seasonNr, seasonEpisodes));
                }
        );

        return seasons;
    }
}
