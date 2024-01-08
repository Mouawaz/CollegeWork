public class Programme extends Education {
    private String level;

    public Programme(String code, String title, String level) {
        super(code, title);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass())
            return false;
        Programme other = (Programme) obj;
        return level.equals(other.level);
    }

    @Override
    public String toString() {
        return "Level: " + level;
    }
}
