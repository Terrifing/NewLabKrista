public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        System.out.println(facade.addNews(0, "Сегодня 1-е число", "DataNews", "Ilya", "Date today"));
        System.out.println(facade.addNews(1, "Сегодня 2-е число", "DataNews", "Ilya", "Date today"));
        System.out.println(facade.addNews(2, "Сегодня 3-е число", "DataNews", "Ilya", "Date today"));
        System.out.println(facade.addNews(3, "Сегодня 4-е число", "DataNews", "Gleb", "Date today"));

        System.out.println(facade.getAllNews());
        System.out.println(facade.getOneNews(1));
        System.out.println(facade.delNews(2));

        System.out.println(facade.getAllNews());

        System.out.println(facade.getShortData(3));
        System.out.println(facade.getAllAuthors());

        System.out.println(facade.upgradeNews(1,"Я Календарь переверну"));
        System.out.println(facade.getOneNews(1));


        System.out.println(facade.addCategories(1,"Sport"));
        System.out.println(facade.addCategories(2,"Celebrity"));
        System.out.println(facade.addCategories(3,"Balls"));
        System.out.println(facade.addCategories(4,"Comedy"));

        System.out.println(facade.getAllCategories());
        System.out.println(facade.delCategories(1));
        System.out.println(facade.getAllCategories());
    }
}
