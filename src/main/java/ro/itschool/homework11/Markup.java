package ro.itschool.homework11;

public class Markup {
    private final int markupId;
    private  final int position;
    private final String content;

    public Markup(int markupId, int position, String content) {
        this.markupId = markupId;
        this.position = position;
        this.content = content;
    }

    public int getMarkupId() {
        return markupId;
    }

    public int getPosition() {
        return position;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Markup ID " +markupId+
                "Position " +position+
                "Content " + content;
    }
}
