package template.first;

public class Main {
    public static void main(String[] args) {
        AuditTrail auditTrail = new AuditTrail();
        TransferMoneyTask transferMoneyTask = new TransferMoneyTask(auditTrail);
        transferMoneyTask.execute();

        GenerateReportTask generateReportTask = new GenerateReportTask(auditTrail);
        generateReportTask.execute();
    }
}
