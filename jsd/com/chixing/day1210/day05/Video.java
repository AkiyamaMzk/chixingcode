package chixing.day1210.day05;

public class Video {
    private String videoType;
    private String videoBrand;
    private  double videoprice;

    @Override
    public String toString() {
        return "Video{" +
                "videoType='" + videoType + '\'' +
                ", videoBrand='" + videoBrand + '\'' +
                ", videoprice=" + videoprice +
                '}';
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getVideoBrand() {
        return videoBrand;
    }

    public void setVideoBrand(String videoBrand) {
        this.videoBrand = videoBrand;
    }

    public double getVideoprice() {
        return videoprice;
    }

    public void setVideoprice(double videoprice) {
        this.videoprice = videoprice;
    }
}
