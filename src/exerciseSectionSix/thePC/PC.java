package exerciseSectionSix.thePC;

public class PC {
    private Motherboard motherboard;
    private Monitor monitor;
    private Case theCase;

    public void powerUp () {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixel(1500,500, "yellow");
    }

    public PC(Motherboard motherboard, Monitor monitor, Case theCase) {
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.theCase = theCase;
    }

}
