package org.johnmenges.demo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.johnmenges.javaparser.JavaBaseListener;
import org.johnmenges.javaparser.JavaParser;

/**
 *
 * @author JohnMenges
 */
public class JavaDemoInstrumenter extends JavaBaseListener {

    public JavaDemoInstrumenter(JavaParser parser) {
        this.parser = parser;
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        System.out.println("visitErrorNode(node)");
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        System.out.println("visitTerminal(node)");
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        System.out.println("exitEveryRule(ctx)");
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        System.out.println("enterEveryRule(ctx)");
    }

    @Override
    public void exitSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx) {
        System.out.println("exitSwitchBlockStatementGroup(ctx)");
    }

    @Override
    public void enterSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx) {
        System.out.println("enterSwitchBlockStatementGroup(ctx)");
    }

    @Override
    public void exitLiteral(JavaParser.LiteralContext ctx) {
        System.out.println("exitLiteral(ctx)");
    }

    @Override
    public void enterLiteral(JavaParser.LiteralContext ctx) {
        System.out.println("enterLiteral(ctx)");
    }

    @Override
    public void exitGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx) {
        System.out.println("exitGenericConstructorDeclaration(ctx)");
    }

    @Override
    public void enterGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx) {
        System.out.println("enterGenericConstructorDeclaration(ctx)");
    }

    @Override
    public void exitInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx) {
        System.out.println("exitInterfaceMemberDeclaration(ctx)");
    }

    @Override
    public void enterInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx) {
        System.out.println("enterInterfaceMemberDeclaration(ctx)");
    }

    @Override
    public void exitArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx) {
        System.out.println("exitArrayCreatorRest(ctx)");
    }

    @Override
    public void enterArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx) {
        System.out.println("enterArrayCreatorRest(ctx)");
    }

    @Override
    public void exitNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx) {
        System.out.println("exitNonWildcardTypeArguments(ctx)");
    }

    @Override
    public void enterNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx) {
        System.out.println("enterNonWildcardTypeArguments(ctx)");
    }

    @Override
    public void exitPrimitiveType(JavaParser.PrimitiveTypeContext ctx) {
        System.out.println("exitPrimitiveType(ctx)");
    }

    @Override
    public void enterPrimitiveType(JavaParser.PrimitiveTypeContext ctx) {
        System.out.println("enterPrimitiveType(ctx)");
    }

    @Override
    public void exitNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx) {
        System.out.println("exitNonWildcardTypeArgumentsOrDiamond(ctx)");
    }

    @Override
    public void enterNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx) {
        System.out.println("enterNonWildcardTypeArgumentsOrDiamond(ctx)");
    }

    @Override
    public void exitArrayInitializer(JavaParser.ArrayInitializerContext ctx) {
        System.out.println("exitArrayInitializer(ctx)");
    }

    @Override
    public void enterArrayInitializer(JavaParser.ArrayInitializerContext ctx) {
        System.out.println("enterArrayInitializer(ctx)");
    }

    @Override
    public void exitMethodBody(JavaParser.MethodBodyContext ctx) {
        System.out.println("exitMethodBody(ctx)");
    }

    @Override
    public void enterMethodBody(JavaParser.MethodBodyContext ctx) {
        System.out.println("enterMethodBody(ctx)");
    }

    @Override
    public void exitElementValuePair(JavaParser.ElementValuePairContext ctx) {
        System.out.println("exitElementValuePair(ctx)");
    }

    @Override
    public void enterElementValuePair(JavaParser.ElementValuePairContext ctx) {
        System.out.println("enterElementValuePair(ctx)");
    }

    @Override
    public void exitResource(JavaParser.ResourceContext ctx) {
        System.out.println("exitResource(ctx)");
    }

    @Override
    public void enterResource(JavaParser.ResourceContext ctx) {
        System.out.println("enterResource(ctx)");
    }

    @Override
    public void exitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) {
        System.out.println("exitConstructorDeclaration(ctx)");
    }

    @Override
    public void enterConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) {
        System.out.println("enterConstructorDeclaration(ctx)");
    }

    @Override
    public void exitResourceSpecification(JavaParser.ResourceSpecificationContext ctx) {
        System.out.println("exitResourceSpecification(ctx)");
    }

    @Override
    public void enterResourceSpecification(JavaParser.ResourceSpecificationContext ctx) {
        System.out.println("enterResourceSpecification(ctx)");
    }

    @Override
    public void exitAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx) {
        System.out.println("exitAnnotationTypeElementRest(ctx)");
    }

    @Override
    public void enterAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx) {
        System.out.println("enterAnnotationTypeElementRest(ctx)");
    }

    @Override
    public void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        System.out.println("exitMethodDeclaration(ctx)");
    }

    @Override
    public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        System.out.println("enterMethodDeclaration(ctx)");
    }

    @Override
    public void exitMemberDeclaration(JavaParser.MemberDeclarationContext ctx) {
        System.out.println("exitMemberDeclaration(ctx)");
    }

    @Override
    public void enterMemberDeclaration(JavaParser.MemberDeclarationContext ctx) {
        System.out.println("enterMemberDeclaration(ctx)");
    }

    @Override
    public void exitCreator(JavaParser.CreatorContext ctx) {
        System.out.println("exitCreator(ctx)");
    }

    @Override
    public void enterCreator(JavaParser.CreatorContext ctx) {
        System.out.println("enterCreator(ctx)");
    }

    @Override
    public void exitQualifiedNameList(JavaParser.QualifiedNameListContext ctx) {
        System.out.println("exitQualifiedNameList(ctx)");
    }

    @Override
    public void enterQualifiedNameList(JavaParser.QualifiedNameListContext ctx) {
        System.out.println("enterQualifiedNameList(ctx)");
    }

    @Override
    public void exitAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx) {
        System.out.println("exitAnnotationTypeBody(ctx)");
    }

    @Override
    public void enterAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx) {
        System.out.println("enterAnnotationTypeBody(ctx)");
    }

    @Override
    public void exitBlockStatement(JavaParser.BlockStatementContext ctx) {
        System.out.println("exitBlockStatement(ctx)");
    }

    @Override
    public void enterBlockStatement(JavaParser.BlockStatementContext ctx) {
        System.out.println("enterBlockStatement(ctx)");
    }

    @Override
    public void exitAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx) {
        System.out.println("exitAnnotationTypeElementDeclaration(ctx)");
    }

    @Override
    public void enterAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx) {
        System.out.println("enterAnnotationTypeElementDeclaration(ctx)");
    }

    @Override
    public void exitTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx) {
        System.out.println("exitTypeArgumentsOrDiamond(ctx)");
    }

    @Override
    public void enterTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx) {
        System.out.println("enterTypeArgumentsOrDiamond(ctx)");
    }

    @Override
    public void exitClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx) {
        System.out.println("exitClassOrInterfaceType(ctx)");
    }

    @Override
    public void enterClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx) {
        System.out.println("enterClassOrInterfaceType(ctx)");
    }

    @Override
    public void exitElementValue(JavaParser.ElementValueContext ctx) {
        System.out.println("exitElementValue(ctx)");
    }

    @Override
    public void enterElementValue(JavaParser.ElementValueContext ctx) {
        System.out.println("enterElementValue(ctx)");
    }

    @Override
    public void exitCompilationUnit(JavaParser.CompilationUnitContext ctx) {
        System.out.println("exitCompilationUnit(ctx)");
    }

    @Override
    public void enterCompilationUnit(JavaParser.CompilationUnitContext ctx) {
        System.out.println("enterCompilationUnit(ctx)");
        TokenStream tokens = parser.getTokenStream();
        PrintWriter writer;
        try {
            writer = new PrintWriter("/Volumes/Menges/Tmp/CompilationUnit.txt");
            writer.write(tokens.getText(ctx));
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaDemoInstrumenter.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("end enterCompilationUnit(ctx)");
    }

    @Override
    public void exitVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx) {
        System.out.println("exitVariableDeclaratorId(ctx)");
    }

    @Override
    public void enterVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx) {
        System.out.println("enterVariableDeclaratorId(ctx)");
    }

    @Override
    public void exitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
        System.out.println("exitLocalVariableDeclaration(ctx)");
    }

    @Override
    public void enterLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
        System.out.println("enterLocalVariableDeclaration(ctx)");
    }

    @Override
    public void exitTypeList(JavaParser.TypeListContext ctx) {
        System.out.println("exitTypeList(ctx)");
    }

    @Override
    public void enterTypeList(JavaParser.TypeListContext ctx) {
        System.out.println("enterTypeList(ctx)");
    }

    @Override
    public void exitForControl(JavaParser.ForControlContext ctx) {
        System.out.println("exitForControl(ctx)");
    }

    @Override
    public void enterForControl(JavaParser.ForControlContext ctx) {
        System.out.println("enterForControl(ctx)");
    }

    @Override
    public void exitLastFormalParameter(JavaParser.LastFormalParameterContext ctx) {
        System.out.println("exitLastFormalParameter(ctx)");
    }

    @Override
    public void enterLastFormalParameter(JavaParser.LastFormalParameterContext ctx) {
        System.out.println("enterLastFormalParameter(ctx)");
    }

    @Override
    public void exitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        System.out.println("exitClassBodyDeclaration(ctx)");
    }

    @Override
    public void enterClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        System.out.println("enterClassBodyDeclaration(ctx)");
    }

    @Override
    public void exitInterfaceBody(JavaParser.InterfaceBodyContext ctx) {
        System.out.println("exitInterfaceBody(ctx)");
    }

    @Override
    public void enterInterfaceBody(JavaParser.InterfaceBodyContext ctx) {
        System.out.println("enterInterfaceBody(ctx)");
    }

    @Override
    public void exitStatement(JavaParser.StatementContext ctx) {
        System.out.println("exitStatement(ctx)");
    }

    @Override
    public void enterStatement(JavaParser.StatementContext ctx) {
        System.out.println("enterStatement(ctx)");
    }

    @Override
    public void exitModifier(JavaParser.ModifierContext ctx) {
        System.out.println("exitModifier(ctx)");
    }

    @Override
    public void enterModifier(JavaParser.ModifierContext ctx) {
        System.out.println("enterModifier(ctx)");
    }

    @Override
    public void exitClassCreatorRest(JavaParser.ClassCreatorRestContext ctx) {
        System.out.println("exitClassCreatorRest(ctx)");
    }

    @Override
    public void enterClassCreatorRest(JavaParser.ClassCreatorRestContext ctx) {
        System.out.println("enterClassCreatorRest(ctx)");
    }

    @Override
    public void exitTypeArguments(JavaParser.TypeArgumentsContext ctx) {
        System.out.println("exitTypeArguments(ctx)");
    }

    @Override
    public void enterTypeArguments(JavaParser.TypeArgumentsContext ctx) {
        System.out.println("enterTypeArguments(ctx)");
    }

    @Override
    public void exitCatchType(JavaParser.CatchTypeContext ctx) {
        System.out.println("exitCatchType(ctx)");
    }

    @Override
    public void enterCatchType(JavaParser.CatchTypeContext ctx) {
        System.out.println("enterCatchType(ctx)");
    }

    @Override
    public void exitConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx) {
        System.out.println("exitConstantDeclarator(ctx)");
    }

    @Override
    public void enterConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx) {
        System.out.println("enterConstantDeclarator(ctx)");
    }

    @Override
    public void exitPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
        System.out.println("exitPackageDeclaration(ctx)");
    }

    @Override
    public void enterPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
        System.out.println("enterPackageDeclaration(ctx)");
    }

    @Override
    public void exitInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx) {
        System.out.println("exitInterfaceDeclaration(ctx)");
    }

    @Override
    public void enterInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx) {
        System.out.println("enterInterfaceDeclaration(ctx)");
    }

    @Override
    public void exitCreatedName(JavaParser.CreatedNameContext ctx) {
        System.out.println("exitCreatedName(ctx)");
    }

    @Override
    public void enterCreatedName(JavaParser.CreatedNameContext ctx) {
        System.out.println("enterCreatedName(ctx)");
    }

    @Override
    public void exitConstDeclaration(JavaParser.ConstDeclarationContext ctx) {
        System.out.println("exitConstDeclaration(ctx)");
    }

    @Override
    public void enterConstDeclaration(JavaParser.ConstDeclarationContext ctx) {
        System.out.println("enterConstDeclaration(ctx)");
    }

    @Override
    public void exitVariableModifier(JavaParser.VariableModifierContext ctx) {
        System.out.println("exitVariableModifier(ctx)");
    }

    @Override
    public void enterVariableModifier(JavaParser.VariableModifierContext ctx) {
        System.out.println("enterVariableModifier(ctx)");
    }

    @Override
    public void exitDefaultValue(JavaParser.DefaultValueContext ctx) {
        System.out.println("exitDefaultValue(ctx)");
    }

    @Override
    public void enterDefaultValue(JavaParser.DefaultValueContext ctx) {
        System.out.println("enterDefaultValue(ctx)");
    }

    @Override
    public void exitClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx) {
        System.out.println("exitClassOrInterfaceModifier(ctx)");
    }

    @Override
    public void enterClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx) {
        System.out.println("enterClassOrInterfaceModifier(ctx)");
    }

    @Override
    public void exitClassBody(JavaParser.ClassBodyContext ctx) {
        System.out.println("exitClassBody(ctx)");
    }

    @Override
    public void enterClassBody(JavaParser.ClassBodyContext ctx) {
        System.out.println("enterClassBody(ctx)");
    }

    @Override
    public void exitPrimary(JavaParser.PrimaryContext ctx) {
        System.out.println("exitPrimary(ctx)");
    }

    @Override
    public void enterPrimary(JavaParser.PrimaryContext ctx) {
        System.out.println("enterPrimary(ctx)");
    }

    @Override
    public void exitAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx) {
        System.out.println("exitAnnotationMethodRest(ctx)");
    }

    @Override
    public void enterAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx) {
        System.out.println("enterAnnotationMethodRest(ctx)");
    }

    @Override
    public void exitEnhancedForControl(JavaParser.EnhancedForControlContext ctx) {
        System.out.println("exitEnhancedForControl(ctx)");
    }

    @Override
    public void enterEnhancedForControl(JavaParser.EnhancedForControlContext ctx) {
        System.out.println("enterEnhancedForControl(ctx)");
    }

    @Override
    public void exitAnnotationName(JavaParser.AnnotationNameContext ctx) {
        System.out.println("exitAnnotationName(ctx)");
    }

    @Override
    public void enterAnnotationName(JavaParser.AnnotationNameContext ctx) {
        System.out.println("enterAnnotationName(ctx)");
    }

    @Override
    public void exitElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx) {
        System.out.println("exitElementValueArrayInitializer(ctx)");
    }

    @Override
    public void enterElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx) {
        System.out.println("enterElementValueArrayInitializer(ctx)");
    }

    @Override
    public void exitType(JavaParser.TypeContext ctx) {
        System.out.println("exitType(ctx)");
    }

    @Override
    public void enterType(JavaParser.TypeContext ctx) {
        System.out.println("enterType(ctx)");
    }

    @Override
    public void exitFormalParameter(JavaParser.FormalParameterContext ctx) {
        System.out.println("exitFormalParameter(ctx)");
    }

    @Override
    public void enterFormalParameter(JavaParser.FormalParameterContext ctx) {
        System.out.println("enterFormalParameter(ctx)");
    }

    @Override
    public void exitResources(JavaParser.ResourcesContext ctx) {
        System.out.println("exitResources(ctx)");
    }

    @Override
    public void enterResources(JavaParser.ResourcesContext ctx) {
        System.out.println("enterResources(ctx)");
    }

    @Override
    public void exitExpression(JavaParser.ExpressionContext ctx) {
        System.out.println("exitExpression(ctx)");
    }

    @Override
    public void enterExpression(JavaParser.ExpressionContext ctx) {
        System.out.println("enterExpression(ctx)");
    }

    @Override
    public void exitAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx) {
        System.out.println("exitAnnotationTypeDeclaration(ctx)");
    }

    @Override
    public void enterAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx) {
        System.out.println("enterAnnotationTypeDeclaration(ctx)");
    }

    @Override
    public void exitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
        System.out.println("exitVariableDeclarator(ctx)");
    }

    @Override
    public void enterVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
        System.out.println("enterVariableDeclarator(ctx)");
    }

    @Override
    public void exitForInit(JavaParser.ForInitContext ctx) {
        System.out.println("exitForInit(ctx)");
    }

    @Override
    public void enterForInit(JavaParser.ForInitContext ctx) {
        System.out.println("enterForInit(ctx)");
    }

    @Override
    public void exitTypeArgument(JavaParser.TypeArgumentContext ctx) {
        System.out.println("exitTypeArgument(ctx)");
    }

    @Override
    public void enterTypeArgument(JavaParser.TypeArgumentContext ctx) {
        System.out.println("enterTypeArgument(ctx)");
    }

    @Override
    public void exitFormalParameters(JavaParser.FormalParametersContext ctx) {
        System.out.println("exitFormalParameters(ctx)");
    }

    @Override
    public void enterFormalParameters(JavaParser.FormalParametersContext ctx) {
        System.out.println("enterFormalParameters(ctx)");
    }

    @Override
    public void exitConstructorBody(JavaParser.ConstructorBodyContext ctx) {
        System.out.println("exitConstructorBody(ctx)");
    }

    @Override
    public void enterConstructorBody(JavaParser.ConstructorBodyContext ctx) {
        System.out.println("enterConstructorBody(ctx)");
    }

    @Override
    public void exitArguments(JavaParser.ArgumentsContext ctx) {
        System.out.println("exitArguments(ctx)");
    }

    @Override
    public void enterArguments(JavaParser.ArgumentsContext ctx) {
        System.out.println("enterArguments(ctx)");
    }

    @Override
    public void exitAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx) {
        System.out.println("exitAnnotationConstantRest(ctx)");
    }

    @Override
    public void enterAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx) {
        System.out.println("enterAnnotationConstantRest(ctx)");
    }

    @Override
    public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        System.out.println("exitClassDeclaration(ctx)");
    }

    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        System.out.println("enterClassDeclaration(ctx)");
    }

    @Override
    public void exitQualifiedName(JavaParser.QualifiedNameContext ctx) {
        System.out.println("exitQualifiedName(ctx)");
    }

    @Override
    public void enterQualifiedName(JavaParser.QualifiedNameContext ctx) {
        System.out.println("enterQualifiedName(ctx)");
    }

    @Override
    public void exitTypeParameters(JavaParser.TypeParametersContext ctx) {
        System.out.println("exitTypeParameters(ctx)");
    }

    @Override
    public void enterTypeParameters(JavaParser.TypeParametersContext ctx) {
        System.out.println("enterTypeParameters(ctx)");
    }

    @Override
    public void exitSwitchLabel(JavaParser.SwitchLabelContext ctx) {
        System.out.println("exitSwitchLabel(ctx)");
    }

    @Override
    public void enterSwitchLabel(JavaParser.SwitchLabelContext ctx) {
        System.out.println("enterSwitchLabel(ctx)");
    }

    @Override
    public void exitParExpression(JavaParser.ParExpressionContext ctx) {
        System.out.println("exitParExpression(ctx)");
    }

    @Override
    public void enterParExpression(JavaParser.ParExpressionContext ctx) {
        System.out.println("enterParExpression(ctx)");
    }

    @Override
    public void exitExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx) {
        System.out.println("exitExplicitGenericInvocation(ctx)");
    }

    @Override
    public void enterExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx) {
        System.out.println("enterExplicitGenericInvocation(ctx)");
    }

    @Override
    public void exitFormalParameterList(JavaParser.FormalParameterListContext ctx) {
        System.out.println("exitFormalParameterList(ctx)");
    }

    @Override
    public void enterFormalParameterList(JavaParser.FormalParameterListContext ctx) {
        System.out.println("enterFormalParameterList(ctx)");
    }

    @Override
    public void exitFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        System.out.println("exitFieldDeclaration(ctx)");
    }

    @Override
    public void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        System.out.println("enterFieldDeclaration(ctx)");
    }

    @Override
    public void exitSuperSuffix(JavaParser.SuperSuffixContext ctx) {
        System.out.println("exitSuperSuffix(ctx)");
    }

    @Override
    public void enterSuperSuffix(JavaParser.SuperSuffixContext ctx) {
        System.out.println("enterSuperSuffix(ctx)");
    }

    @Override
    public void exitLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx) {
        System.out.println("exitLocalVariableDeclarationStatement(ctx)");
    }

    @Override
    public void enterLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx) {
        System.out.println("enterLocalVariableDeclarationStatement(ctx)");
    }

    @Override
    public void exitGenericInterfaceMethodDeclaration(JavaParser.GenericInterfaceMethodDeclarationContext ctx) {
        System.out.println("exitGenericInterfaceMethodDeclaration(ctx)");
    }

    @Override
    public void enterGenericInterfaceMethodDeclaration(JavaParser.GenericInterfaceMethodDeclarationContext ctx) {
        System.out.println("enterGenericInterfaceMethodDeclaration(ctx)");
    }

    @Override
    public void exitBlock(JavaParser.BlockContext ctx) {
        System.out.println("exitBlock(ctx)");
    }

    @Override
    public void enterBlock(JavaParser.BlockContext ctx) {
        System.out.println("enterBlock(ctx)");
    }

    @Override
    public void exitVariableInitializer(JavaParser.VariableInitializerContext ctx) {
        System.out.println("exitVariableInitializer(ctx)");
    }

    @Override
    public void enterVariableInitializer(JavaParser.VariableInitializerContext ctx) {
        System.out.println("enterVariableInitializer(ctx)");
    }

    @Override
    public void exitStatementExpression(JavaParser.StatementExpressionContext ctx) {
        System.out.println("exitStatementExpression(ctx)");
    }

    @Override
    public void enterStatementExpression(JavaParser.StatementExpressionContext ctx) {
        System.out.println("enterStatementExpression(ctx)");
    }

    @Override
    public void exitTypeBound(JavaParser.TypeBoundContext ctx) {
        System.out.println("exitTypeBound(ctx)");
    }

    @Override
    public void enterTypeBound(JavaParser.TypeBoundContext ctx) {
        System.out.println("enterTypeBound(ctx)");
    }

    @Override
    public void exitEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx) {
        System.out.println("exitEnumBodyDeclarations(ctx)");
    }

    @Override
    public void enterEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx) {
        System.out.println("enterEnumBodyDeclarations(ctx)");
    }

    @Override
    public void exitTypeParameter(JavaParser.TypeParameterContext ctx) {
        System.out.println("exitTypeParameter(ctx)");
    }

    @Override
    public void enterTypeParameter(JavaParser.TypeParameterContext ctx) {
        System.out.println("enterTypeParameter(ctx)");
    }

    @Override
    public void exitExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx) {
        System.out.println("exitExplicitGenericInvocationSuffix(ctx)");
    }

    @Override
    public void enterExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx) {
        System.out.println("enterExplicitGenericInvocationSuffix(ctx)");
    }

    @Override
    public void exitEnumDeclaration(JavaParser.EnumDeclarationContext ctx) {
        System.out.println("exitEnumDeclaration(ctx)");
    }

    @Override
    public void enterEnumDeclaration(JavaParser.EnumDeclarationContext ctx) {
        System.out.println("enterEnumDeclaration(ctx)");
    }

    @Override
    public void exitConstantExpression(JavaParser.ConstantExpressionContext ctx) {
        System.out.println("exitConstantExpression(ctx)");
    }

    @Override
    public void enterConstantExpression(JavaParser.ConstantExpressionContext ctx) {
        System.out.println("enterConstantExpression(ctx)");
    }

    @Override
    public void exitCatchClause(JavaParser.CatchClauseContext ctx) {
        System.out.println("exitCatchClause(ctx)");
    }

    @Override
    public void enterCatchClause(JavaParser.CatchClauseContext ctx) {
        System.out.println("enterCatchClause(ctx)");
    }

    @Override
    public void exitEnumConstants(JavaParser.EnumConstantsContext ctx) {
        System.out.println("exitEnumConstants(ctx)");
    }

    @Override
    public void enterEnumConstants(JavaParser.EnumConstantsContext ctx) {
        System.out.println("enterEnumConstants(ctx)");
    }

    @Override
    public void exitInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx) {
        System.out.println("exitInterfaceBodyDeclaration(ctx)");
    }

    @Override
    public void enterInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx) {
        System.out.println("enterInterfaceBodyDeclaration(ctx)");
    }

    @Override
    public void exitInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx) {
        System.out.println("exitInterfaceMethodDeclaration(ctx)");
    }

    @Override
    public void enterInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx) {
        System.out.println("enterInterfaceMethodDeclaration(ctx)");
    }

    @Override
    public void exitElementValuePairs(JavaParser.ElementValuePairsContext ctx) {
        System.out.println("exitElementValuePairs(ctx)");
    }

    @Override
    public void enterElementValuePairs(JavaParser.ElementValuePairsContext ctx) {
        System.out.println("enterElementValuePairs(ctx)");
    }

    @Override
    public void exitVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx) {
        System.out.println("exitVariableDeclarators(ctx)");
    }

    @Override
    public void enterVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx) {
        System.out.println("enterVariableDeclarators(ctx)");
    }

    @Override
    public void exitFinallyBlock(JavaParser.FinallyBlockContext ctx) {
        System.out.println("exitFinallyBlock(ctx)");
    }

    @Override
    public void enterFinallyBlock(JavaParser.FinallyBlockContext ctx) {
        System.out.println("enterFinallyBlock(ctx)");
    }

    @Override
    public void exitEnumConstantName(JavaParser.EnumConstantNameContext ctx) {
        System.out.println("exitEnumConstantName(ctx)");
    }

    @Override
    public void enterEnumConstantName(JavaParser.EnumConstantNameContext ctx) {
        System.out.println("enterEnumConstantName(ctx)");
    }

    @Override
    public void exitAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx) {
        System.out.println("exitAnnotationMethodOrConstantRest(ctx)");
    }

    @Override
    public void enterAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx) {
        System.out.println("enterAnnotationMethodOrConstantRest(ctx)");
    }

    @Override
    public void exitImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
        System.out.println("exitImportDeclaration(ctx)");
    }

    @Override
    public void enterImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
        System.out.println("enterImportDeclaration(ctx)");
    }

    @Override
    public void exitEnumConstant(JavaParser.EnumConstantContext ctx) {
        System.out.println("exitEnumConstant(ctx)");
    }

    @Override
    public void enterEnumConstant(JavaParser.EnumConstantContext ctx) {
        System.out.println("enterEnumConstant(ctx)");
    }

    @Override
    public void exitAnnotation(JavaParser.AnnotationContext ctx) {
        System.out.println("exitAnnotation(ctx)");
    }

    @Override
    public void enterAnnotation(JavaParser.AnnotationContext ctx) {
        System.out.println("enterAnnotation(ctx)");
    }

    @Override
    public void exitForUpdate(JavaParser.ForUpdateContext ctx) {
        System.out.println("exitForUpdate(ctx)");
    }

    @Override
    public void enterForUpdate(JavaParser.ForUpdateContext ctx) {
        System.out.println("enterForUpdate(ctx)");
    }

    @Override
    public void exitTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
        System.out.println("exitTypeDeclaration(ctx)");
    }

    @Override
    public void enterTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
        System.out.println("enterTypeDeclaration(ctx)");
    }

    @Override
    public void exitExpressionList(JavaParser.ExpressionListContext ctx) {
        System.out.println("exitExpressionList(ctx)");
    }

    @Override
    public void enterExpressionList(JavaParser.ExpressionListContext ctx) {
        System.out.println("enterExpressionList(ctx)");
    }

    @Override
    public void exitGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx) {
        System.out.println("exitGenericMethodDeclaration(ctx)");
    }

    @Override
    public void enterGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx) {
        System.out.println("enterGenericMethodDeclaration(ctx)");
    }

    @Override
    public void exitInnerCreator(JavaParser.InnerCreatorContext ctx) {
        System.out.println("exitInnerCreator(ctx)");
    }

    @Override
    public void enterInnerCreator(JavaParser.InnerCreatorContext ctx) {
        System.out.println("enterInnerCreator(ctx)");
    }
    
    private JavaParser parser;
    
}
