/* Generated By:JavaCC: Do not edit this line. RookieParserVisitor.java Version 7.0.5 */
package edu.berkeley.cs186.database.cli.parser;

public interface RookieParserVisitor
{
  public void visit(SimpleNode node, Object data);
  public void visit(ASTSQLStatementList node, Object data);
  public void visit(ASTExecutableStatement node, Object data);
  public void visit(ASTExplainStatement node, Object data);
  public void visit(ASTDropTableStatement node, Object data);
  public void visit(ASTDropIndexStatement node, Object data);
  public void visit(ASTReleaseStatement node, Object data);
  public void visit(ASTSavepointStatement node, Object data);
  public void visit(ASTRollbackStatement node, Object data);
  public void visit(ASTBeginStatement node, Object data);
  public void visit(ASTCommitStatement node, Object data);
  public void visit(ASTInsertStatement node, Object data);
  public void visit(ASTInsertValues node, Object data);
  public void visit(ASTUpdateStatement node, Object data);
  public void visit(ASTSelectStatement node, Object data);
  public void visit(ASTCommonTableExpression node, Object data);
  public void visit(ASTDeleteStatement node, Object data);
  public void visit(ASTCreateTableStatement node, Object data);
  public void visit(ASTCreateIndexStatement node, Object data);
  public void visit(ASTColumnDef node, Object data);
  public void visit(ASTSelectClause node, Object data);
  public void visit(ASTLimitClause node, Object data);
  public void visit(ASTFromClause node, Object data);
  public void visit(ASTOrderClause node, Object data);
  public void visit(ASTJoinedTable node, Object data);
  public void visit(ASTSelectColumn node, Object data);
  public void visit(ASTResultColumnName node, Object data);
  public void visit(ASTColumnName node, Object data);
  public void visit(ASTIdentifier node, Object data);
  public void visit(ASTAliasedTableName node, Object data);
  public void visit(ASTColumnValueComparison node, Object data);
  public void visit(ASTNumericLiteral node, Object data);
  public void visit(ASTIntegerLiteral node, Object data);
  public void visit(ASTLiteral node, Object data);
  public void visit(ASTComparisonOperator node, Object data);
  public void visit(ASTLogicalOperator node, Object data);
  public void visit(ASTMultiplicativeOperator node, Object data);
  public void visit(ASTAdditiveOperator node, Object data);
  public void visit(ASTExpression node, Object data);
  public void visit(ASTLogicalExpression node, Object data);
  public void visit(ASTComparisonExpression node, Object data);
  public void visit(ASTAdditiveExpression node, Object data);
  public void visit(ASTMultiplicativeExpression node, Object data);
  public void visit(ASTFunctionCallExpression node, Object data);
  public void visit(ASTPrimaryExpression node, Object data);
}
/* JavaCC - OriginalChecksum=4578cc734cd4e3691924ea21bd64fca2 (do not edit this line) */