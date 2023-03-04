package exc_functional.task1;

import java.util.List;
import java.util.stream.Collectors;

public class Usage {
    public static void main(String[] args) {
        // Get some seasons and episodes from a mock datasource called SeasonProvider.
        // In a real application, data like this would be provided by a database or an API,
        // but in this case we'll have to make our own automatic generator to get some data
        // to work with.
        final SeasonProvider seasonProvider = new SeasonProvider(5, 4);
        final List<Season> seasons = seasonProvider.getSeasons();

        // A list of all episodes.
        final List<Episode> allEpisodes = seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .collect(Collectors.toList());

        System.out.println("A list of all episodes:");
        allEpisodes.forEach(episode -> System.out.println(episode.episodeName));
        System.out.println("End of list.\n");

        // A list of all videos.
        final List<Video> allVideos = seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .flatMap(episode -> episode.videos.stream())
                .collect(Collectors.toList());

        System.out.println("A list of all videos:");
        allVideos.forEach(video -> System.out.println(video.title + " available at " + video.url));
        System.out.println("End of list.\n");

        // A list of all season names.
        final List<String> allSeasonNames = seasons.stream()
                .map(season -> season.seasonName)
                .collect(Collectors.toList());

        System.out.println("A list of all season names:");
        allSeasonNames.forEach(seasonName -> System.out.println(seasonName));
        System.out.println("End of list.\n");

        // A list of all season numbers.
        final List<Integer> allSeasonNumbers = seasons.stream()
                .map(season -> season.seasonNumber)
                .collect(Collectors.toList());

        System.out.println("A list of all season numbers:");
        allSeasonNumbers.forEach(seasonNumber -> System.out.println(seasonNumber));
        System.out.println("End of list.\n");

        // A list of all episode names.
        final List<String> allEpisodeNames = seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .map(episode -> episode.episodeName)
                .collect(Collectors.toList());

        System.out.println("A list of all episode names:");
        allEpisodeNames.forEach(episodeName -> System.out.println(episodeName));
        System.out.println("End of list.\n");

        // A list of all episode numbers.
        final List<Integer> allEpisodeNumbers = seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .map(episode -> episode.episodeNumber)
                .collect(Collectors.toList());

        System.out.println("A list of all episode numbers:");
        allEpisodeNumbers.forEach(episodeNumber -> System.out.println(episodeNumber));
        System.out.println("End of list.\n");

        // A list of all video names.
        final List<String> allVideoNames = seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .flatMap(episode -> episode.videos.stream())
                .map(video -> video.title)
                .collect(Collectors.toList());

        System.out.println("A list of all video names:");
        allVideoNames.forEach(videoName -> System.out.println(videoName));
        System.out.println("End of list.\n");

        // A list of all url addresses for each video.
        final List<String> allVideoUrls = seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .flatMap(episode -> episode.videos.stream())
                .map(video -> video.url)
                .collect(Collectors.toList());

        System.out.println("A list of all url addresses for each video:");
        allVideoUrls.forEach(url -> System.out.println(url));
        System.out.println("End of list.\n");

        // Only episodes from even seasons.
        final List<Episode> evenSeasonsEpisodes = seasons.stream()
                .filter(season -> season.seasonNumber % 2 == 0)
                .flatMap(season -> season.episodes.stream())
                .collect(Collectors.toList());

        System.out.println("Only episodes from even seasons:");
        evenSeasonsEpisodes.forEach(episode -> System.out.println(episode.episodeName));
        System.out.println("End of list.\n");

        // Only videos from even seasons.
        final List<Video> evenSeasonsEpisodesVideos = seasons.stream()
                .filter(season -> season.seasonNumber % 2 == 0)
                .flatMap(season -> season.episodes.stream())
                .flatMap(episode -> episode.videos.stream())
                .collect(Collectors.toList());

        System.out.println("Only videos from even seasons:");
        evenSeasonsEpisodesVideos.forEach(video -> System.out.println(video.title + " available at " + video.url));
        System.out.println("End of list.\n");

        // Only videos from even episodes and even seasons.
        final List<Video> evenSeasonsEvenEpisodesVideos = seasons.stream()
                .filter(season -> season.seasonNumber % 2 == 0)
                .flatMap(season -> season.episodes.stream())
                .filter(episode -> episode.episodeNumber % 2 == 0)
                .flatMap(episode -> episode.videos.stream())
                .collect(Collectors.toList());

        System.out.println("Only videos from even episodes and even seasons:");
        evenSeasonsEvenEpisodesVideos.forEach(video -> System.out.println(video.title + " available at " + video.url));
        System.out.println("End of list.\n");

        // Only clip videos from even episodes and odd seasons.
        final List<Video> oddSeasonsEvenEpisodesClipVideos = seasons.stream()
                .filter(season -> season.seasonNumber % 2 != 0)
                .flatMap(season -> season.episodes.stream())
                .filter(episode -> episode.episodeNumber % 2 == 0)
                .flatMap(episode -> episode.videos.stream())
                .filter(video -> video.videoType == VideoType.CLIP)
                .collect(Collectors.toList());

        System.out.println("Only clip videos from even episodes and odd seasons:");
        oddSeasonsEvenEpisodesClipVideos.forEach(video -> System.out.println(video.title + " available at " + video.url));
        System.out.println("End of list.\n");

        // Only preview videos from odd episodes and even seasons.
        final List<Video> evenSeasonsOddEpisodesPreviewVideos = seasons.stream()
                .filter(season -> season.seasonNumber % 2 == 0)
                .flatMap(season -> season.episodes.stream())
                .filter(episode -> episode.episodeNumber % 2 != 0)
                .flatMap(episode -> episode.videos.stream())
                .filter(video -> video.videoType == VideoType.PREVIEW)
                .collect(Collectors.toList());

        System.out.println("Only preview videos from odd episodes and even seasons:");
        oddSeasonsEvenEpisodesClipVideos.forEach(video -> System.out.println(video.title + " available at " + video.url));
        System.out.println("End of list.\n");
    }
}
