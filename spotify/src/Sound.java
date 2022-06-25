public class Sound {
    final private String title;
    final private String duration;

    public Sound(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Sound)) return false;
        Sound sound = (Sound) o;
        return (this.getTitle() == sound.getTitle()) && (this.getDuration() == sound.getDuration());
    }
}
