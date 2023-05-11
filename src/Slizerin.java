public class Slizerin extends Hogwards{
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;
    private static String SLIZERIN = "Слизерин";


    public Slizerin(String name, int magic, int transgressive, int trick, int determination, int ambition, int resourcefulness, int power) {
        super(name, SLIZERIN, magic, transgressive);
        if (trick<0 || trick>100 || determination<0 || determination>100 || ambition<0 || ambition>100 || resourcefulness<0 || resourcefulness>100 || power<0 || power>100){
            throw new IllegalArgumentException("Неверные значения");
        }
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Trick - "+ trick);
        System.out.println("Determination - "+ determination);
        System.out.println("Ambition - "+ ambition);
        System.out.println("Resourcefulness - "+ resourcefulness);
        System.out.println("Power - "+ power);
        System.out.println();
    }

    @Override
    public void compareFaculty(Hogwards student) {
        super.compareFaculty(student);
    }

    @Override
    public int getSumFaculty() {
        return trick + determination + ambition + resourcefulness + power;
    }
}
