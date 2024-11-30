public class Task3_Animals {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tom", 2);
        Cat cat1 = new Cat("Mr. Cat", 4, 2);
        Fish fish1 = new Fish(2, "Carp");
        Animals[] animals = new Animals[]{dog1, cat1, fish1};
        for (Animals animal : animals) {
            System.out.println(animal.toString());
        }
    }


    static abstract class Animals {
        abstract void move();

        abstract void eat();

    }

    static class Dog extends Animals {
        private String name;
        private int age;

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        void move() {
            System.out.println("Run");
        }

        void eat() {
            System.out.println("Likes to gnaw bones");
        }
    }

    static class Cat extends Animals {
        String nickname;
        int paws;
        int children;

        @Override
        public String toString() {
            return "Cat{" +
                    "nickname='" + nickname + '\'' +
                    ", paws=" + paws +
                    ", children=" + children +
                    '}';
        }

        public Cat(String nickname, int paws, int children) {
            this.nickname = nickname;
            this.paws = paws;
            this.children = children;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public int getPaws() {
            return paws;
        }

        public void setPaws(int paws) {
            this.paws = paws;
        }

        public int getChildren() {
            return children;
        }

        public void setChildren(int children) {
            this.children = children;
        }

        void move() {
            System.out.println("Run");
        }

        void eat() {
            System.out.println("Eat birds");
        }
    }

    static class Fish extends Animals {
        int count;
        String subtype;

        @Override
        public String toString() {
            return "Fish{" +
                    "count=" + count +
                    ", subtype='" + subtype + '\'' +
                    '}';
        }

        public Fish(int count, String subtype) {
            this.count = count;
            this.subtype = subtype;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getSubtype() {
            return subtype;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        void move() {
            System.out.println("Swim");
        }

        void eat() {
            System.out.println("Eat algae");
        }
    }
}
