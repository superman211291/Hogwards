public class Kogtewran extends Hogwards{

    private int mind;
    private int wisdom;
    private  int wit;
    private int creative;
    private static String KOGTEWRAN = "Когтевран";


    public Kogtewran(String name, int magic, int transgressive, int mind, int wisdom, int wit, int creative) {
        super(name,KOGTEWRAN,magic,transgressive);
        if (mind<0 || mind>100 || wisdom<0 || wisdom>100 || wit<0 || wit>100 || creative<0 || creative>100){
            throw new IllegalArgumentException("Неверные значения");
        }
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Mind - "+ mind);
        System.out.println("Wisdom - "+ wisdom);
        System.out.println("wit - "+ wit);
        System.out.println("creative - "+ creative);
        System.out.println();
    }

    @Override
    public void compareFaculty(Hogwards student) {
        super.compareFaculty(student);
    }


    @Override
    public int getSumFaculty() {
        return mind + wisdom + wit + creative;
    }
}
