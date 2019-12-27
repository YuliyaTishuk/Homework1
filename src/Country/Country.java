package Country;

import java.util.TreeSet;

public enum Country implements ICountry {
    Belarus(207_595, 9_47_174), Ireland(70_273, 4_921_500),
    Kazakhstan(2_724_902, 18_592_730), Micronesia(702, 104_600),
    Morocco(710_850, 33_848_242), Finland(338_400, 5_521_158),
    Czech(78_866, 10_677_540), Ecuador(283_560, 16_080_778),
    SouthAfrica(1_219_912, 54_956_900), Japanese(377_944, 126_225_000);

    int area, population;

    Country(int area, int population) {
        this.area = area;
        this.population = population;
    }

    @Override
    public int getArea() {
        return area;
    }

    @Override
    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Страна {Название=" + this.name() + ",площадь = " + this.area +" км2, население = " + this.population + " млн. человек}";
    }


    public static class ComparisonArea implements Comparable<ComparisonArea> {
        int area;
        String name;

        ComparisonArea(String name, int area) {
            this.name = name;
            this.area = area;
        }

        @Override
        public int compareTo(ComparisonArea anotherArea) {
            return this.area - anotherArea.area;
        }
    }

    public static void main(String[] args) {
        System.out.println(Country.Belarus);//надо добавить название
        System.out.println(Country.Kazakhstan);
        Country country = Country.valueOf("Kazakhstan");//передать имя элемента
        System.out.println(country);
        TreeSet<ComparisonArea> treeSet = new TreeSet<>();
        treeSet.add(new ComparisonArea("Площадь Беларуси", 207_595));
        treeSet.add(new ComparisonArea("Площадь Ирландии", 70_273));
        for (ComparisonArea ComparisonArea : treeSet) {
            System.out.println(ComparisonArea.name + " составляет " + ComparisonArea.area + "км2");
        }


    }
}


