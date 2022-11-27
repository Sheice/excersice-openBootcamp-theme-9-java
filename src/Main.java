public class Main {
    public static void main(String[] args) {

        //using class client inheriting of Person
        Client client = new Client();

        client.setName("Jaziel");
        client.setAge(34);
        client.setPhone(1234112341);
        client.setCredit(131);

        System.out.println("Hola " + client.getName() + " Por su cumpleaños número "
        + client.getAge() + " Queremos otorgarlo un crédito especial de: $" + client.getCredit() +
                " ,lo estaremos llamando a su número: " + client.getPhone()
        );

        //using class employee inheriting of Person

        Employee employee = new Employee();

        employee.setAge(13);
        employee.setName("Juancin");
        employee.setPhone(12312412);
        employee.setSalary(234);


        System.out.println("Hola " + employee.getName() + " con la edad de: "
                + employee.getAge() + " años, tiene un salario de $" + employee.getSalary() +
                " ,lo estaremos llamando a su número " + employee.getPhone() + " para ayudar a sacar el dinero"
        );



    }

    // custom class

    //master class

    static class Person {
        int age;
        String name;
        int phone;

        public int getPhone() {
            return this.phone;
        }

        public void setPhone(int phone) {
            this.phone = phone;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    //class children


    static class  Client extends  Person{
        int credit;



        public int getCredit() {
            return this.credit;
        }

        public void setCredit(int credit) {
            this.credit = credit;
        }
    }

    static class Employee extends Person {
        float salary;

        public float getSalary() {
            return salary;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }
    }
}