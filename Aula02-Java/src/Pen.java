public class Pen {
    public String model;
    public String color;
    private float tip;
    protected int charge;
    protected boolean covered;
    public void status() {
        System.out.println("Model: " + this.model);
        System.out.println("This pen is " + this.color);
        System.out.println("This pen has a tip of " + this.tip);
        System.out.println("This pen is with a charge of " + this.charge);
        System.out.println("This pen is covered? " + this.covered);
    }

    public void scribble() {
        if(this.covered == true) {
            System.out.println("The pen is covered, I can't scribble");
        } else {
            System.out.println("I am scribbling");
        }
    }

    protected void cover() {
        this.covered = true;
    }

    protected void uncover() {
        this.covered = false;
    }
}
