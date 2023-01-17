public class Mabook {
    private String post;
    private String HOME;
    private  String market;
    private String grup;
    private String PAGE;

    public void setPost(String post) {
        this.post = post;
    }

    public String getHOME() {
        return HOME;
    }

    public void setBeranda(String HOME) {
        this.HOME = HOME;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public String getPAGE() {
        return PAGE;
    }

    public void setPAGE(String PAGE) {
        this.PAGE = PAGE;
    }

    public String getPost(){
        return post;
    }
    public Mabook(){
    }

    public Mabook(String pst,String brd,String mrt,String grp,String hlm) {
        this.post = pst;
        this.HOME = brd;
        this.market = mrt;
        this.PAGE = hlm;
    }
}