public class Main {
    public static void main(String[] args) {
        Hogwards magicStudents[] = {
                new Griffindor("Гарри Поттер", 70, 40, 50, 60, 90),
                new Griffindor("Гермиона Грейнджер", 90, 90, 40, 50, 80),
                new Griffindor("Рон Уизли", 60, 70, 40, 50, 80),
                new Slizerin("Драко Малфой", 70, 50, 80, 90, 40, 70, 90),
                new Slizerin("Грэхэм Монтегю", 40, 60, 70, 80, 20, 34, 40),
                new Slizerin("Грегори Гойл", 39, 40, 40, 40, 10, 47, 70),
                new Pufendui("Захария Смит", 80, 70, 32, 53, 56),
                new Pufendui("Седрик Диггори", 90, 45, 76, 25, 35),
                new Pufendui("Джастин Финч-Флетчли", 60, 70, 34, 35, 53),
                new Kogtewran("Чжоу Чанг", 60, 80, 60, 45, 34, 76),
                new Kogtewran("Падма Патил", 60, 40, 70, 35, 39, 56),
                new Kogtewran("Маркус Белби", 66, 88, 40, 95, 52, 98)
        };

        for (Hogwards magicStudent : magicStudents) {
            magicStudent.print();
        }

        magicStudents[0].compareFaculty(magicStudents[2]);
        //magicStudents[0].compareFaculty(magicStudents[3]);
        magicStudents[1].compare(magicStudents[7]);
        magicStudents[1].compare(magicStudents[2]);


    }
}