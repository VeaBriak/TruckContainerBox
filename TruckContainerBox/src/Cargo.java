public class Cargo {
    private int truck;
    private int container;
    private int box;

    public Cargo(int box) {
        this.box = box;
        if (box != 0) {
            container = box % 27 == 0 ? box / 27 : box / 27 + 1;
        }
        if (container != 0) {
            truck = container % 12 == 0 ? container / 12 : container / 12 + 1;
        }
    }

    public int getTruck()
    {
        return truck;
    }

    public int getContainer()
    {
        return container;
    }

    public int getBox()
    {
        return box;
    }

    public void fullPrint() {
        int a = 1;
        int b = 1;
        for (int i = 1; i <= truck; i++)
        {
            System.out.printf("Truck %d:\n", i);
            int j = 0;
            while (j < 12 && b <= container)
            {
                System.out.printf("container %3d:\n ", b);
                int k = 0;
                while (k < 27 && a <= box)
                {
                    System.out.printf("box %3d;\n ", a);
                    k++;
                    a++;
                }
                j++;
                b++;
                System.out.println();
            }
        }

        System.out.println("For " + box + " boxes will need:\n" + "trucks : " + getTruck()
                + "\ncontainers: " + getContainer());
    }
}

