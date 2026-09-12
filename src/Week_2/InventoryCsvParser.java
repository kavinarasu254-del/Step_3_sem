package Week_2;

public class InventoryCsvParser {

    public void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
        } else {
            String product = fields[0].trim();
            String sku = fields[1].trim();
            String qty = fields[2].trim();

            System.out.println("Product: " + product + " | SKU: " + sku + " | Qty: " + qty);
        }
    }

    public static void main(String[] args) {
        InventoryCsvParser parser = new InventoryCsvParser();

        parser.parseInventoryRecord("Wireless Mouse, WM-2201,150");
        parser.parseInventoryRecord("Wireless Mouse, 150");
    }
}