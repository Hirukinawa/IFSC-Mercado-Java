package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cliente extends Pessoa {
    @Column
    private String cpf;
    @Column
    private String rg;
    @Column
    @Temporal(TemporalType.DATE)
    private Date dtNascimento;
    @Column
    private String sexo;

    public Cliente() {
    }

    public Cliente(String cpf, String rg, Date dtNascimento, String sexo) {
        this.cpf = cpf;
        this.rg = rg;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
    }

    public Cliente(String cpf, String rg, Date dtNascimento, String sexo, int id, String nome, String fone1, String fone2, String complementoEndereco, String email, Date dtCadastro, String observacao, String status, Endereco endereco) {
        super(id, nome, fone1, fone2, complementoEndereco, email, dtCadastro, observacao, status, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    @Override
    public String toString() {
        return super.toString() + ";" + this.getCpf() + ";" + this.getRg() + ";" + 
        this.getDtNascimento() + ";" + this.getSexo();
    }    
    
}

/*
[EL Warning]: 2023-06-30 21:59:18.085--UnitOfWork(162982002)--Exception [EclipseLink-4002] (Eclipse Persistence Services - 2.5.2.v20140319-9ad6abd): org.eclipse.persistence.exceptions.DatabaseException
Internal Exception: com.mysql.cj.jdbc.exceptions.MysqlDataTruncation: Data truncation: Incorrect integer value: 'A' for column `retaguarda`.`cliente`.`status` at row 1
Error Code: 1366
Call: INSERT INTO CLIENTE (COMPLEMENTOENDERECO, CPF, DTCADASTRO, DTNASCIMENTO, EMAIL, FONE1, FONE2, NOME, OBSERVACAO, RG, SEXO, STATUS, ENDERECO_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
	bind => [13 parameters bound]
Query: InsertObjectQuery(Cliente{cpf=888.888.888-88, rg=444444444, dtNascimento=Sat Nov 11 00:00:00 BRT 1111, sexo=MasculinoPessoa{id=0, nome=jaum jaum, fone1=(11)1111-1111, fone2=(11)1111-1111, email=jaumjaum@globo.com, dtCadastro=null, observacao=, complementoEndereco=null, status=A, endereco=1;88705710;rua maria correa;1;Teste;Cidade{id=1, descricao=teste1}}})
javax.persistence.RollbackException: Exception [EclipseLink-4002] (Eclipse Persistence Services - 2.5.2.v20140319-9ad6abd): org.eclipse.persistence.exceptions.DatabaseException
Internal Exception: com.mysql.cj.jdbc.exceptions.MysqlDataTruncation: Data truncation: Incorrect integer value: 'A' for column `retaguarda`.`cliente`.`status` at row 1
Error Code: 1366
Call: INSERT INTO CLIENTE (COMPLEMENTOENDERECO, CPF, DTCADASTRO, DTNASCIMENTO, EMAIL, FONE1, FONE2, NOME, OBSERVACAO, RG, SEXO, STATUS, ENDERECO_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
	bind => [13 parameters bound]
Query: InsertObjectQuery(Cliente{cpf=888.888.888-88, rg=444444444, dtNascimento=Sat Nov 11 00:00:00 BRT 1111, sexo=MasculinoPessoa{id=0, nome=jaum jaum, fone1=(11)1111-1111, fone2=(11)1111-1111, email=jaumjaum@globo.com, dtCadastro=null, observacao=, complementoEndereco=null, status=A, endereco=1;88705710;rua maria correa;1;Teste;Cidade{id=1, descricao=teste1}}})
	at org.eclipse.persistence.internal.jpa.transaction.EntityTransactionImpl.commit(EntityTransactionImpl.java:157)
	at com.mycompany.mercadomaven_jpa_hibernate.modelDAO.ClienteDAO.create(ClienteDAO.java:47)
	at com.mycompany.mercadomaven_jpa_hibernate.service.ClienteService.criar(ClienteService.java:11)
	at com.mycompany.mercadomaven_jpa_hibernate.controler.ControllerCadCliente.actionPerformed(ControllerCadCliente.java:96)
	at java.desktop/javax.swing.AbstractButton.fireActionPerformed(AbstractButton.java:1972)
	at java.desktop/javax.swing.AbstractButton$Handler.actionPerformed(AbstractButton.java:2314)
	at java.desktop/javax.swing.DefaultButtonModel.fireActionPerformed(DefaultButtonModel.java:407)
	at java.desktop/javax.swing.DefaultButtonModel.setPressed(DefaultButtonModel.java:262)
	at java.desktop/javax.swing.plaf.basic.BasicButtonListener.mouseReleased(BasicButtonListener.java:279)
	at java.desktop/java.awt.Component.processMouseEvent(Component.java:6620)
	at java.desktop/javax.swing.JComponent.processMouseEvent(JComponent.java:3398)
	at java.desktop/java.awt.Component.processEvent(Component.java:6385)
	at java.desktop/java.awt.Container.processEvent(Container.java:2266)
	at java.desktop/java.awt.Component.dispatchEventImpl(Component.java:4995)
	at java.desktop/java.awt.Container.dispatchEventImpl(Container.java:2324)
	at java.desktop/java.awt.Component.dispatchEvent(Component.java:4827)
	at java.desktop/java.awt.LightweightDispatcher.retargetMouseEvent(Container.java:4948)
	at java.desktop/java.awt.LightweightDispatcher.processMouseEvent(Container.java:4575)
	at java.desktop/java.awt.LightweightDispatcher.dispatchEvent(Container.java:4516)
	at java.desktop/java.awt.Container.dispatchEventImpl(Container.java:2310)
	at java.desktop/java.awt.Window.dispatchEventImpl(Window.java:2780)
	at java.desktop/java.awt.Component.dispatchEvent(Component.java:4827)
	at java.desktop/java.awt.EventQueue.dispatchEventImpl(EventQueue.java:775)
	at java.desktop/java.awt.EventQueue$4.run(EventQueue.java:720)
	at java.desktop/java.awt.EventQueue$4.run(EventQueue.java:714)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:400)
	at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(ProtectionDomain.java:87)
	at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(ProtectionDomain.java:98)
	at java.desktop/java.awt.EventQueue$5.run(EventQueue.java:747)
	at java.desktop/java.awt.EventQueue$5.run(EventQueue.java:745)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:400)
	at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(ProtectionDomain.java:87)
	at java.desktop/java.awt.EventQueue.dispatchEvent(EventQueue.java:744)
	at java.desktop/java.awt.EventDispatchThread.pumpOneEventForFilters(EventDispatchThread.java:203)
	at java.desktop/java.awt.EventDispatchThread.pumpEventsForFilter(EventDispatchThread.java:124)
	at java.desktop/java.awt.EventDispatchThread.pumpEventsForHierarchy(EventDispatchThread.java:113)
	at java.desktop/java.awt.EventDispatchThread.pumpEvents(EventDispatchThread.java:109)
	at java.desktop/java.awt.EventDispatchThread.pumpEvents(EventDispatchThread.java:101)
	at java.desktop/java.awt.EventDispatchThread.run(EventDispatchThread.java:90)
Caused by: Exception [EclipseLink-4002] (Eclipse Persistence Services - 2.5.2.v20140319-9ad6abd): org.eclipse.persistence.exceptions.DatabaseException
Internal Exception: com.mysql.cj.jdbc.exceptions.MysqlDataTruncation: Data truncation: Incorrect integer value: 'A' for column `retaguarda`.`cliente`.`status` at row 1
Error Code: 1366
Call: INSERT INTO CLIENTE (COMPLEMENTOENDERECO, CPF, DTCADASTRO, DTNASCIMENTO, EMAIL, FONE1, FONE2, NOME, OBSERVACAO, RG, SEXO, STATUS, ENDERECO_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
	bind => [13 parameters bound]
Query: InsertObjectQuery(Cliente{cpf=888.888.888-88, rg=444444444, dtNascimento=Sat Nov 11 00:00:00 BRT 1111, sexo=MasculinoPessoa{id=0, nome=jaum jaum, fone1=(11)1111-1111, fone2=(11)1111-1111, email=jaumjaum@globo.com, dtCadastro=null, observacao=, complementoEndereco=null, status=A, endereco=1;88705710;rua maria correa;1;Teste;Cidade{id=1, descricao=teste1}}})
	at org.eclipse.persistence.exceptions.DatabaseException.sqlException(DatabaseException.java:331)
	at org.eclipse.persistence.internal.databaseaccess.DatabaseAccessor.executeDirectNoSelect(DatabaseAccessor.java:900)
	at org.eclipse.persistence.internal.databaseaccess.DatabaseAccessor.executeNoSelect(DatabaseAccessor.java:962)
	at org.eclipse.persistence.internal.databaseaccess.DatabaseAccessor.basicExecuteCall(DatabaseAccessor.java:631)
	at org.eclipse.persistence.internal.databaseaccess.DatabaseAccessor.executeCall(DatabaseAccessor.java:558)
	at org.eclipse.persistence.internal.sessions.AbstractSession.basicExecuteCall(AbstractSession.java:2002)
	at org.eclipse.persistence.sessions.server.ClientSession.executeCall(ClientSession.java:298)
	at org.eclipse.persistence.internal.queries.DatasourceCallQueryMechanism.executeCall(DatasourceCallQueryMechanism.java:242)
	at org.eclipse.persistence.internal.queries.DatasourceCallQueryMechanism.executeCall(DatasourceCallQueryMechanism.java:228)
	at org.eclipse.persistence.internal.queries.DatasourceCallQueryMechanism.insertObject(DatasourceCallQueryMechanism.java:377)
	at org.eclipse.persistence.internal.queries.StatementQueryMechanism.insertObject(StatementQueryMechanism.java:165)
	at org.eclipse.persistence.internal.queries.StatementQueryMechanism.insertObject(StatementQueryMechanism.java:180)
	at org.eclipse.persistence.internal.queries.DatabaseQueryMechanism.insertObjectForWrite(DatabaseQueryMechanism.java:489)
	at org.eclipse.persistence.queries.InsertObjectQuery.executeCommit(InsertObjectQuery.java:80)
	at org.eclipse.persistence.queries.InsertObjectQuery.executeCommitWithChangeSet(InsertObjectQuery.java:90)
	at org.eclipse.persistence.internal.queries.DatabaseQueryMechanism.executeWriteWithChangeSet(DatabaseQueryMechanism.java:301)
	at org.eclipse.persistence.queries.WriteObjectQuery.executeDatabaseQuery(WriteObjectQuery.java:58)
	at org.eclipse.persistence.queries.DatabaseQuery.execute(DatabaseQuery.java:899)
	at org.eclipse.persistence.queries.DatabaseQuery.executeInUnitOfWork(DatabaseQuery.java:798)
	at org.eclipse.persistence.queries.ObjectLevelModifyQuery.executeInUnitOfWorkObjectLevelModifyQuery(ObjectLevelModifyQuery.java:108)
	at org.eclipse.persistence.queries.ObjectLevelModifyQuery.executeInUnitOfWork(ObjectLevelModifyQuery.java:85)
	at org.eclipse.persistence.internal.sessions.UnitOfWorkImpl.internalExecuteQuery(UnitOfWorkImpl.java:2896)
	at org.eclipse.persistence.internal.sessions.AbstractSession.executeQuery(AbstractSession.java:1804)
	at org.eclipse.persistence.internal.sessions.AbstractSession.executeQuery(AbstractSession.java:1786)
	at org.eclipse.persistence.internal.sessions.AbstractSession.executeQuery(AbstractSession.java:1737)
	at org.eclipse.persistence.internal.sessions.CommitManager.commitNewObjectsForClassWithChangeSet(CommitManager.java:226)
	at org.eclipse.persistence.internal.sessions.CommitManager.commitAllObjectsWithChangeSet(CommitManager.java:125)
	at org.eclipse.persistence.internal.sessions.AbstractSession.writeAllObjectsWithChangeSet(AbstractSession.java:4207)
	at org.eclipse.persistence.internal.sessions.UnitOfWorkImpl.commitToDatabase(UnitOfWorkImpl.java:1441)
	at org.eclipse.persistence.internal.sessions.UnitOfWorkImpl.commitToDatabaseWithChangeSet(UnitOfWorkImpl.java:1531)
	at org.eclipse.persistence.internal.sessions.RepeatableWriteUnitOfWork.commitRootUnitOfWork(RepeatableWriteUnitOfWork.java:277)
	at org.eclipse.persistence.internal.sessions.UnitOfWorkImpl.commitAndResume(UnitOfWorkImpl.java:1169)
	at org.eclipse.persistence.internal.jpa.transaction.EntityTransactionImpl.commit(EntityTransactionImpl.java:132)
	... 38 more
Caused by: com.mysql.cj.jdbc.exceptions.MysqlDataTruncation: Data truncation: Incorrect integer value: 'A' for column `retaguarda`.`cliente`.`status` at row 1
	at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:104)
	at com.mysql.cj.jdbc.ClientPreparedStatement.executeInternal(ClientPreparedStatement.java:974)
	at com.mysql.cj.jdbc.ClientPreparedStatement.executeUpdateInternal(ClientPreparedStatement.java:1113)
	at com.mysql.cj.jdbc.ClientPreparedStatement.executeUpdateInternal(ClientPreparedStatement.java:1061)
	at com.mysql.cj.jdbc.ClientPreparedStatement.executeLargeUpdate(ClientPreparedStatement.java:1381)
	at com.mysql.cj.jdbc.ClientPreparedStatement.executeUpdate(ClientPreparedStatement.java:1046)
	at org.eclipse.persistence.internal.databaseaccess.DatabaseAccessor.executeDirectNoSelect(DatabaseAccessor.java:890)
*/
