public class Griffindor extends Hogwards {
 private int nobility;
 private int honor;
 private  int bravery;

 private static String GRIFFINDOR = "Гриффиндор";

    public Griffindor(String name, int magic, int transgressive, int nobility, int honor, int bravery) {
        super(name, GRIFFINDOR, magic, transgressive);
        if (nobility<0 || nobility>100 || honor<0 || honor>100 || bravery<0 || bravery>100){
            throw new IllegalArgumentException("Неверные значения");
        }
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Nobility - "+ nobility);
        System.out.println("Honor - "+ honor);
        System.out.println("Bravery - "+ bravery);
        System.out.println();
    }

    @Override
    public int getSumFaculty() {
        return nobility + honor + bravery;
    }

    @Override
    public void compareFaculty(Hogwards student) {
        super.compareFaculty(student);
    }
}
