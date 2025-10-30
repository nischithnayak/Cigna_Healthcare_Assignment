

class QualityAssurance {
    public void reviewProcess() {
        System.out.println("QA: Reviewing development process for compliance.");
    }
}

class QualityControl {
    public void testProduct() {
        System.out.println("QC: Testing product for defects.");
    }
}

public class QualityDemo {
    public static void main(String[] args) {
        QualityAssurance qa = new QualityAssurance();
        QualityControl qc = new QualityControl();

        qa.reviewProcess();
        qc.testProduct();
    }
}
