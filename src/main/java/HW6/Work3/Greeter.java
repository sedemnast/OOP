package HW6.Work3;
// Нарушен принцип
// Single responsibility principle
// Принцип единственной ответственности
// Модуль должен отвечать за одного и только одного актора


public class Greeter {
    private String formality;

    public String communication() {
        switch (this.formality) {
            case "formal":
                Formal formal = new Formal();         // для каждого актора создаем отдельный класс
                return formal.greet();
                // ... и еще много чего, что душа пожелает
            case "casual":
                Casual casual = new Casual();
                return casual.greet();
            case "intimate":
                Intimate intimate = new Intimate();
                return intimate.greet();
            default:
                Other1 other1 = new Other1();
                return other1.greet();
        }
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}

class Formal{
    public String greet() {
        return "Good evening, sir.";
    }
}

class Casual{
    public String greet() {
        return "Sup bro?";
    }
}

class Intimate{
    public String greet() {
        return "Hello Darling!";
    }
}

class Other1{
    public String greet() {
        return "Hello.";
    }
}