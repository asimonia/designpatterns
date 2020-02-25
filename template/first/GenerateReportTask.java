package template.first;

class GenerateReportTask {
    private AuditTrail auditTrail;

    GenerateReportTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    void execute() {
        auditTrail.record();
        System.out.println("Generate report");
    }
}
