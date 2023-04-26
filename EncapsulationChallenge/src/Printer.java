public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > 100) {
            this.tonerLevel = 100;
        } else if (tonerLevel < 0) {
            this.tonerLevel = 0;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }


    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        tonerLevel += tonerAmount;
        if (tonerLevel > 100 || tonerLevel < 0) {
            return -1;
        }
        return tonerLevel;
    }

    public int printPages(int pages) {
        if (duplex) {
            System.out.println("This is a duplex printer");
            return pagesPrinted += (pages / 2) + (pages % 2);
        }
        return pagesPrinted += pages;
    }

}
