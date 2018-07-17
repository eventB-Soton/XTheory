/*
 * generated by Xtext 2.13.0
 */
package ac.soton.xtheory.parser.antlr;

import ac.soton.xtheory.parser.antlr.internal.InternalTheoryParser;
import ac.soton.xtheory.services.TheoryGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class TheoryParser extends AbstractAntlrParser {

	@Inject
	private TheoryGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS");
	}
	

	@Override
	protected InternalTheoryParser createParser(XtextTokenStream stream) {
		return new InternalTheoryParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Theory";
	}

	public TheoryGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TheoryGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
