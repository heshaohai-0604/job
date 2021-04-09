package demo.p;

/**
 * @Auther: hsh
 * @Date: 2021/4/8 16:18
 * @Description: //TODO
 */
public class Use {
    private String dialogue1;
    private String dialogue2;

    public String getDialogue1() {
        return dialogue1;
    }

    public void setDialogue1(String dialogue1) {
        this.dialogue1 = dialogue1;
    }

    public String getDialogue2() {
        return dialogue2;
    }

    public void setDialogue2(String dialogue2) {
        this.dialogue2 = dialogue2;
    }

    @Override
    public String toString() {
        return "Use{" +
                "dialogue1='" + dialogue1 + '\'' +
                ", dialogue2='" + dialogue2 + '\'' +
                '}';
    }
}
