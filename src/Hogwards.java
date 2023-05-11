public abstract class Hogwards {
    private String name;
    private final String nameFaculty;
    private int magic;
    private int transgressive;
    private Hogwards student;

    public Hogwards(String name, String nameFaculty, int magic, int transgressive) {
        if (magic<0 || magic>100 || transgressive<0 || transgressive>100){
            throw new IllegalArgumentException("Неверные значения");
        }
        this.name = name;
        this.nameFaculty = nameFaculty;
        this.magic = magic;
        this.transgressive = transgressive;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgressive() {
        return transgressive;
    }

    public String getName() {
        return name;
    }

    public void print(){
        System.out.println(name);
        System.out.println("Magic - " + magic);
        System.out.println("Transgressive - " + transgressive);
    }


    public void compare(Hogwards student) {
        int sum1 = getSumPower();
        int sum2 = student.getSumPower();
        if (sum1 > sum2){
            System.out.println(getName() + " лучший ученик школы магии, чем " + student.getName());
        } else {
            System.out.println(student.getName() + " лучший ученик школы магии, чем " + getName());
        }

    }
    private int getSumPower(){
        return magic + transgressive;
    }


    public String getNameFaculty() {
        return nameFaculty;
    }

    public void compareFaculty(Hogwards student) {
        if (nameFaculty.equals(student.getNameFaculty())){
            int sum1 = getSumFaculty();
            int sum2 = student.getSumFaculty();
            if (sum1 > sum2){
                System.out.println(getName() + " лучший ученик факуцльтета " + nameFaculty + ", чем " + student.getName());
            } else {
                System.out.println(student.getName() + " лучший ученик факуцльтета " + nameFaculty + ", чем " + getName());
            }
        } else {
            throw new IllegalArgumentException("Ученики из разных факультетов!");
        }
    }
    public abstract int getSumFaculty();

}
