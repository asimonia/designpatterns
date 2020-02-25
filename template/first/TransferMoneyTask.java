package template.first;

class TransferMoneyTask {
    private AuditTrail auditTrail;

    TransferMoneyTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    void execute() {
        auditTrail.record();
        System.out.println("Transfer money");
    }
}
