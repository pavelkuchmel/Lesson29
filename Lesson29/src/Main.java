import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Set<String> set = new HashSet<>();
        set.add("Армения");
        set.add("Азербайджан");
        set.add("Грузия");
        set.add("Турция");
        set.add("Россия");
        if (!(set.contains("Россия"))) System.out.println("России в множестве нет");
        else System.out.println("Россия есть в множестве");

        for (String s : set){
            System.out.println(s);
        }*/

        /*Set<HeavyBox> treeSet = new TreeSet();
        for (int i = 0; i < 10; i++){
            treeSet.add(new HeavyBox());
        }
        for (HeavyBox s : treeSet){
            System.out.println(s);
        }*/

        Product[] productArray = {
                new Product("Апельсин", 2.99, 4),
                new Product("Виноград", 1.89, 5),
                new Product("Виноград", 2.79, 4),
                new Product("Виноград", 8.19, 1),
                new Product("Гранат", 4.39, 3),
                new Product("Шаурма", 9.99, 5),
                new Product("Апельсин", 4.59, 2),
                new Product("Шаурма", 8.99, 4),
                new Product("Пепперони", 14.99, 5),
                new Product("Сосиськи", 3.79, 2),
        };

        List<Product> productsList = Arrays.asList(productArray);

        System.out.println("Cортировка по имени:");

        sort(1, productsList);

        /*Collections.sort(productsList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/

        System.out.println(productsList);

        System.out.println("Cортировка по стоймости:");

        sort(2, productsList);

        /*Collections.sort(productsList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return ((Double)o1.getPrice()).compareTo(((Double)o2.getPrice()));
            }
        });*/

        System.out.println(productsList);

        System.out.println("Cортировка по рейтингу (по убыванию):");

        sort(3, productsList);

        /*Collections.sort(productsList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return ((Integer)o2.getRating()).compareTo(((Integer)o1.getRating()));
            }
        });*/

        System.out.println(productsList);

        System.out.println("Cортировка по имени и стойомсти:");

        sort(4, productsList);

        /*Collections.sort(productsList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getName().compareTo(o2.getName()) == 0) return ((Double)o1.getPrice()).compareTo(((Double)o2.getPrice()));
                else return o1.getName().compareTo(o2.getName());
            }
        });*/

        System.out.println(productsList);

        //Comparator<Product> comparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
        //Comparator<Product> comparator = Comparator.reverseOrder();
        //Collections.sort(productsList, compByPriceRevers);
        //System.out.println(productsList);
    }
    public static void sort(int i, List<Product> productsList){
        switch (i) {
            case 1:
            Collections.sort(productsList, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            break;
            case 2:
            Collections.sort(productsList, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return ((Double) o1.getPrice()).compareTo(((Double) o2.getPrice()));
                }
            });
            break;
            case 3:
            Collections.sort(productsList, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return ((Integer) o2.getRating()).compareTo(((Integer) o1.getRating()));
                }
            });
            break;
            case 4:
                Collections.sort(productsList, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        if (o1.getName().compareTo(o2.getName()) == 0)
                            return ((Double) o1.getPrice()).compareTo(((Double) o2.getPrice()));
                        else return o1.getName().compareTo(o2.getName());
                    }
                });
                break;
        }
    }
}
