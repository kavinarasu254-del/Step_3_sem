package Week_1;

public class WarehouseBalancer {

    public void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0;
        int totalB = 0;
        int maxQty = -1;
        String maxSection = "";
        int maxItem = -1;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            if (sectionA[i] > maxQty) {
                maxQty = sectionA[i];
                maxSection = "Section A";
                maxItem = i + 1;
            }
        }

        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];
            if (sectionB[i] > maxQty) {
                maxQty = sectionB[i];
                maxSection = "Section B";
                maxItem = i + 1;
            }
        }

        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";

        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB +
                " | Status: " + status + " | Highest Quantity: " + maxQty +
                " (" + maxSection + ", Item " + maxItem + ")");
    }

    public static void main(String[] args) {
        WarehouseBalancer balancer = new WarehouseBalancer();

        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};

        balancer.analyzeInventory(sectionA, sectionB);
    }
}