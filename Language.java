public class Language {
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;

  protected String wordOrder;

  public Language(String langName, int speakers, String regions, String wdOrder) {
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionsSpoken = regions;
    this.wordOrder = wdOrder;
  }

  public void getInfo() {
    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
    System.out.println("The language follows the word order: " + wordOrder);
  }

  public static void main(String[] args) {
    Language chuj = new Mayan("Chuj", 61630);
    chuj.getInfo();

    Language mandarinChinese = new SinoTibetan("Mandarin Chinese", 920000000);
    mandarinChinese.getInfo();

    Language burmese = new SinoTibetan("Burmese", 33000000);
    burmese.getInfo();
  }
}