/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author david
 */
public class Main {
    
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
        
        
//        Book b1 = new Book("Fiction", "E12345", "To Kill a Mockingbird", "Harper Lee", "HarperCollins", "Literature", 1960, 20);
//        Book b2 = new Book("Science", "A67890", "A Brief History of Time", "Stephen Hawking", "Bantam Books", "Physics", 1988, 0);
//        Book b3 = new Book("Biography", "D24680", "Steve Jobs", "Walter Isaacson", "Simon & Schuster", "Business", 2011, 0);
//        Book b4 = new Book("Travel", "13579", "Into Thin Air", "Jon Krakauer", "Villard Books", "Mountaineering", 1997, 0);
//        Book b5 = new Book("History", "86420", "The Rise and Fall of the Third Reich", "William L. Shirer", "Simon & Schuster", "World War II", 1960, 0);
//        Book b6 = new Book("Art", "97531", "The Story of Art", "E.H. Gombrich", "Phaidon Press", "Art History", 1950, 0);
//        Book b7 = new Book("Cooking", "78912", "Mastering the Art of French Cooking", "Julia Child", "Alfred A. Knopf", "French Cuisine", 1961, 0);
//        Book b8 = new Book("Philosophy", "35791", "Beyond Good and Evil", "Friedrich Nietzsche", "Penguin Classics", "Ethics", 1886, 0);
//        Book b9 = new Book("Self-help", "24601", "The 7 Habits of Highly Effective People", "Stephen Covey", "Free Press", "Personal Development", 1989, 0);
//        Book b10 = new Book("Sports", "80246", "Friday Night Lights", "H.G. Bissinger", "Da Capo Press", "Football", 1990, 0);
//
//        Book[] books = new Book[10];
//        books[0] = b1;
//        books[1] = b2;
//        books[2] = b3;
//        books[3] = b4;
//            
//        Student st1 = new Student("0012345678", "Juan", "Pérez");
//        Student st2 = new Student("0023456789", "María", "García");
//        Student st3 = new Student("0034567890", "Pedro", "Ramírez");
//        Student st4 = new Student("0045678901", "Ana", "Martínez");
//        Student st5 = new Student("0056789012", "Carlos", "Gómez");
//
//        Student[] students = new Student[10];
//        students[0] = st1;
//        students[1] = st2;
//        students[2] = st3;
//        
//        Library libreria = new Library();
//        libreria.Delete("E12345");
//        libreria.Insert(b9);
//        System.out.println(libreria.toString());
//        System.out.println(libreria.SearchBook("24601"));
        
    }
}
