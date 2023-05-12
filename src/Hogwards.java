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

    /**
     * 1)Не реализован метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии, и выводит в консоль сравнительную оценку между двумя учениками
     * Данный метод реализует сравнение двух ученников по силе магии и способности к трансгрессии.
     * @param student
     */
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

    /**
     * 2) Стоит отказаться от поля nameFaculty и проводить проверку через this.getClass().equals(hogwarts.getClass())
     * а данный метод реализует сравнение 2х учеников одного факультета.
     * И в данном варианте моего кода не хотелось бы удалять поле nameFaculty
     * для адаптивного вывода на печать в зависимости от сравниваемых учеников
     * одного факультета. Можно конечно сделать данный метод и без данного поля но
     * тогда не понятно будет учеников какого факультета мы сравниваем. А если прописывать
     * жестко в коде наименование факультета прийдется писать данный метод в классе каждого
     * факультета что не будет соотвествовать принципам ООП.
     * @param student
     */
    public void compareFaculty(Hogwards student) {
        if (this.getClass().equals(student.getClass())){
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
