import java.time.LocalDate;

public class facture {
    private int idFacture;
    private double montantTotal;
    private String periode;
    private String statut;
    private LocalDate dateEmission;
    private LocalDate datePaiement;

    private paiement paiement;
}
