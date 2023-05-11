public class Pufendui extends Hogwards{

    private int industriousness;
    private int honesty;
    private int loyalty;
    private static String PUFENDUI = "Пуфендуй";

    public Pufendui(String name, int magic, int transgressive, int industriousness, int honesty, int loyalty) {
        super(name, PUFENDUI, magic, transgressive);
        if (industriousness<0 || industriousness>100 || honesty<0 || honesty>100 || loyalty<0 || loyalty>100){
            throw new IllegalArgumentException("Неверные значения");
        }
        this.industriousness = industriousness;
        this.honesty = honesty;
        this.loyalty = loyalty;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Industriousness - "+ industriousness);
        System.out.println("Honesty - "+ honesty);
        System.out.println("Loyalty - "+ loyalty);
        System.out.println();
    }

    @Override
    public void compareFaculty(Hogwards student) {
        super.compareFaculty(student);
    }

    @Override
    public int getSumFaculty() {
        return industriousness + honesty + loyalty;
    }
}
