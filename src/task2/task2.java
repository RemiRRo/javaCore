package task2;

enum EAuthors {
    DONTSOVA("Unclassified materials"),
    LOVECRAFT("Dagon");

    private final String code;

    EAuthors(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}


class task2 {
    public static void main(String[] args){
        favoriteBooks(EAuthors.LOVECRAFT);
        triangle();
    }

    public static void favoriteBooks(EAuthors code) {
        switch (code) {
            case DONTSOVA:
                System.out.println("WTF?");
                break;
            case LOVECRAFT:
                System.out.println("Favorite book " + code.getCode());
                break;
        }
    }

    public static void triangle(){
        int num = 91;
        int count = 1;
        String space;

        for(int i = 1; count <= num; i++) {
            space = count < 10 ? "  " : " ";
            for (int j = 1; j < i; j++) {
                System.out.print(count + space);
                count++;
            }
            System.out.println("");
        }
    }
}
