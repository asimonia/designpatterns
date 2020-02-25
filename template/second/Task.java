package template.second;

public abstract class Task {
    private AuditTrail auditTrail;

    Task() {
        auditTrail = new AuditTrail();
    }

    void execute() {
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
