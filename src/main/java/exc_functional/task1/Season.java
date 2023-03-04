package exc_functional.task1;

import java.util.List;

class Season {
    public String seasonName;
    public int seasonNumber;
    List<Episode> episodes;
    public Season(String seasonName, int seasonNumber,
                  List<Episode> episodes) {
        this.seasonName = seasonName;
        this.seasonNumber = seasonNumber;
        this.episodes = episodes;
    }


}
