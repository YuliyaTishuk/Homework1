package Country;

public interface ICountry {
    int getArea();
    int getPopulation();

    enum Area {
        Belarus(207_595), Ireland(70_273), Kazakhstan(2_724_902), Micronesia(702),
        Morocco(710_850), Finland(338_400), Czech(78_866), Ecuador(283_560),
        SouthAfrica(1_219_912), Japanese(377_944);

        public int Area;

        Area(int area) {

        }
    }

    enum Population {
        Belarus(9_47_174), Ireland(4_921_500), Kazakhstan(18_592_730), Micronesia(104_600),
        Morocco(33_848_242), Finland(5_521_158), Czech(10_677_540), Ecuador(16_080_778),
        SouthAfrica(54_956_900), Japanese(126_225_000);

        Population(int population) {
        }
    }
}
