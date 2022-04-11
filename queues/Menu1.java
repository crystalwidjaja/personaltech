package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// The Menu Class has a HashMap of Menu Rows
public class Menu1 {
    // Format
    // Key {0, 1, 2, ...} created based on order of input menu
    // Value {MenuRow0, MenuRow1, MenuRow2,...} each corresponds to key
    // MenuRow  {<Exit,Noop>, Option1, Option2, ...}
    Map<Integer, MenuRow1> menu1 = new HashMap<>();

    /**
     *  Constructor for Menu,
     *
     * @param  rows,  is the row data for menu.
     */
    public Menu1(MenuRow1[] rows) {
        int i = 0;
        for (MenuRow1 row : rows) {
            // Build HashMap for lookup convenience
            menu1.put(i++, new MenuRow1(row.getTitle(), row.getAction()));
        }
    }

    /**
     *  Get Row from Menu,
     *
     * @param  i,  HashMap key (k)
     *
     * @return  MenuRow, the selected menu
     */
    public MenuRow1 get(int i) {
        return menu1.get(i);
    }

    /**
     *  Iterate through and print rows in HashMap
     */
    public void print() {
        for (Map.Entry<Integer, MenuRow1> pair : menu1.entrySet()) {
            System.out.println(pair.getKey() + " ==> " + pair.getValue().getTitle());
        }
    }

    /**
     *  To test run Driver
     */
    public static void main(String[] args) {
        Driver.main(args);
    }

}

// The MenuRow Class has title and action for individual line item in menu
class MenuRow1 {
    String title;       // menu item title
    Runnable action;    // menu item action, using Runnable

    /**
     *  Constructor for MenuRow,
     *
     * @param  title,  is the description of the menu item
     * @param  action, is the run-able action for the menu item
     */
    public MenuRow1(String title, Runnable action) {
        this.title = title;
        this.action = action;
    }

    /**
     *  Getters
     */
    public String getTitle() {
        return this.title;
    }
    public Runnable getAction() {
        return this.action;
    }

    /**
     *  Runs the action using Runnable (.run)
     */
    public void run() {
        action.run();
    }
}

// The Main Class illustrates initializing and using Menu with Runnable action
class Driver {
    /**
     *  Menu Control Example
     */
    public static void main(String[] args) {
        // Row initialize
        MenuRow1[] rows = new MenuRow1[]{
                new MenuRow1("Exit", () -> main(null)),
                new MenuRow1("Queuing Strings", () -> Strings.main(null)),  // lambda style, () -> to point to Class.Method
                new MenuRow1("Reversing Stacks", () -> Reverse.main(null)),
                new MenuRow1("Combine Queues", () -> Combine.main(null)),
        };

        // Menu construction
        Menu1 menu1 = new Menu1(rows);

        // Run menu forever, exit condition contained in loop
        while (true) {
            System.out.println("Hacks Menu:");
            // print rows
            menu1.print();

            // Scan for input
            try {
                Scanner sc = new Scanner(System.in);
                int selection = sc.nextInt();

                // menu action
                try {
                    MenuRow1 row = menu1.get(selection);
                    // stop menu condition
                    if (row.getTitle().equals("Exit"))
                        return;
                    // run option
                    row.run();
                } catch (Exception e) {
                    System.out.printf("Invalid selection %d\n", selection);
                }
            } catch (Exception e) {
                System.out.println("Not a number");
            }
        }
    }
}