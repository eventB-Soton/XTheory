package org.eclipse.emf.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;

public class Class_
{
  protected static String nl;
  public static synchronized Class_ create(String lineSeparator)
  {
    nl = lineSeparator;
    Class_ result = new Class_();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**";
  protected final String TEXT_3 = NL + " * ";
  protected final String TEXT_4 = NL + " * <copyright>" + NL + " * </copyright>";
  protected final String TEXT_5 = NL + " *" + NL + " * ";
  protected final String TEXT_6 = "Id";
  protected final String TEXT_7 = NL + " */";
  protected final String TEXT_8 = NL + "package ";
  protected final String TEXT_9 = ";";
  protected final String TEXT_10 = NL + "package ";
  protected final String TEXT_11 = ";";
  protected final String TEXT_12 = NL;
  protected final String TEXT_13 = NL;
  protected final String TEXT_14 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A representation of the model object '<em><b>";
  protected final String TEXT_15 = "</b></em>'." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_16 = NL + " *" + NL + " * <!-- begin-model-doc -->" + NL + " * ";
  protected final String TEXT_17 = NL + " * <!-- end-model-doc -->";
  protected final String TEXT_18 = NL + " *";
  protected final String TEXT_19 = NL + " * <p>" + NL + " * The following features are supported:" + NL + " * <ul>";
  protected final String TEXT_20 = NL + " *   <li>{@link ";
  protected final String TEXT_21 = "#";
  protected final String TEXT_22 = " <em>";
  protected final String TEXT_23 = "</em>}</li>";
  protected final String TEXT_24 = NL + " * </ul>" + NL + " * </p>";
  protected final String TEXT_25 = NL + " *";
  protected final String TEXT_26 = NL + " * @see ";
  protected final String TEXT_27 = "#get";
  protected final String TEXT_28 = "()";
  protected final String TEXT_29 = NL + " * @model ";
  protected final String TEXT_30 = NL + " *        ";
  protected final String TEXT_31 = NL + " * @model";
  protected final String TEXT_32 = NL + " * @extends ";
  protected final String TEXT_33 = NL + " * @generated" + NL + " */";
  protected final String TEXT_34 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model object '<em><b>";
  protected final String TEXT_35 = "</b></em>'." + NL + " * <!-- end-user-doc -->" + NL + " * <p>";
  protected final String TEXT_36 = NL + " * The following features are implemented:" + NL + " * <ul>";
  protected final String TEXT_37 = NL + " *   <li>{@link ";
  protected final String TEXT_38 = "#";
  protected final String TEXT_39 = " <em>";
  protected final String TEXT_40 = "</em>}</li>";
  protected final String TEXT_41 = NL + " * </ul>";
  protected final String TEXT_42 = NL + " * </p>" + NL + " *" + NL + " * @generated" + NL + " */";
  protected final String TEXT_43 = NL + "public";
  protected final String TEXT_44 = " abstract";
  protected final String TEXT_45 = " class ";
  protected final String TEXT_46 = NL + "public interface ";
  protected final String TEXT_47 = NL + "{";
  protected final String TEXT_48 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_49 = " copyright = ";
  protected final String TEXT_50 = ";";
  protected final String TEXT_51 = NL;
  protected final String TEXT_52 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_53 = " mofDriverNumber = \"";
  protected final String TEXT_54 = "\";";
  protected final String TEXT_55 = NL;
  protected final String TEXT_56 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL;
  protected final String TEXT_57 = NL + "\t/**" + NL + "\t * An array of objects representing the values of non-primitive features." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Object[] ";
  protected final String TEXT_58 = ";" + NL;
  protected final String TEXT_59 = NL + "\t/**" + NL + "\t * A bit field representing the indices of non-primitive feature values." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_60 = ";" + NL;
  protected final String TEXT_61 = NL + "\t/**" + NL + "\t * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_62 = " = 0;" + NL;
  protected final String TEXT_63 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_64 = "() <em>";
  protected final String TEXT_65 = "</em>}' ";
  protected final String TEXT_66 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_67 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_68 = " ";
  protected final String TEXT_69 = ";" + NL;
  protected final String TEXT_70 = NL + "\t/**" + NL + "\t * The empty value for the '{@link #";
  protected final String TEXT_71 = "() <em>";
  protected final String TEXT_72 = "</em>}' array accessor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_73 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_74 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_75 = NL + "\tprotected static final ";
  protected final String TEXT_76 = "[] ";
  protected final String TEXT_77 = "_EEMPTY_ARRAY = new ";
  protected final String TEXT_78 = " [0]";
  protected final String TEXT_79 = ";" + NL;
  protected final String TEXT_80 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_81 = "() <em>";
  protected final String TEXT_82 = "</em>}' ";
  protected final String TEXT_83 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_84 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_85 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_86 = NL + "\tprotected static final ";
  protected final String TEXT_87 = " ";
  protected final String TEXT_88 = "; // TODO The default value literal \"";
  protected final String TEXT_89 = "\" is not valid.";
  protected final String TEXT_90 = " = ";
  protected final String TEXT_91 = ";";
  protected final String TEXT_92 = NL;
  protected final String TEXT_93 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_94 = " = 0;" + NL;
  protected final String TEXT_95 = NL + "\t/**" + NL + "\t * The offset of the flags representing the value of the '{@link #";
  protected final String TEXT_96 = "() <em>";
  protected final String TEXT_97 = "</em>}' ";
  protected final String TEXT_98 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_99 = "_EFLAG_OFFSET = ";
  protected final String TEXT_100 = ";" + NL + "" + NL + "\t/**" + NL + "\t * The flags representing the default value of the '{@link #";
  protected final String TEXT_101 = "() <em>";
  protected final String TEXT_102 = "</em>}' ";
  protected final String TEXT_103 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_104 = "_EFLAG_DEFAULT = ";
  protected final String TEXT_105 = ".ordinal()";
  protected final String TEXT_106 = ".VALUES.indexOf(";
  protected final String TEXT_107 = ")";
  protected final String TEXT_108 = " << ";
  protected final String TEXT_109 = "_EFLAG_OFFSET;" + NL + "" + NL + "\t/**" + NL + "\t * The array of enumeration values for '{@link ";
  protected final String TEXT_110 = " ";
  protected final String TEXT_111 = "}'" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprivate static final ";
  protected final String TEXT_112 = "[] ";
  protected final String TEXT_113 = "_EFLAG_VALUES = ";
  protected final String TEXT_114 = ".values()";
  protected final String TEXT_115 = "(";
  protected final String TEXT_116 = "[])";
  protected final String TEXT_117 = ".VALUES.toArray(new ";
  protected final String TEXT_118 = "[";
  protected final String TEXT_119 = ".VALUES.size()])";
  protected final String TEXT_120 = ";" + NL;
  protected final String TEXT_121 = NL + "\t/**" + NL + "\t * The flag";
  protected final String TEXT_122 = " representing the value of the '{@link #";
  protected final String TEXT_123 = "() <em>";
  protected final String TEXT_124 = "</em>}' ";
  protected final String TEXT_125 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_126 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_127 = "_EFLAG = ";
  protected final String TEXT_128 = " << ";
  protected final String TEXT_129 = "_EFLAG_OFFSET";
  protected final String TEXT_130 = ";" + NL;
  protected final String TEXT_131 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_132 = "() <em>";
  protected final String TEXT_133 = "</em>}' ";
  protected final String TEXT_134 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_135 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_136 = " ";
  protected final String TEXT_137 = " = ";
  protected final String TEXT_138 = ";" + NL;
  protected final String TEXT_139 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_140 = " = 0;" + NL;
  protected final String TEXT_141 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_142 = " ";
  protected final String TEXT_143 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_144 = "_ESETFLAG = 1 << ";
  protected final String TEXT_145 = ";" + NL;
  protected final String TEXT_146 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_147 = " ";
  protected final String TEXT_148 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected boolean ";
  protected final String TEXT_149 = "ESet;" + NL;
  protected final String TEXT_150 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_151 = " = ";
  protected final String TEXT_152 = ".getFeatureID(";
  protected final String TEXT_153 = ") - ";
  protected final String TEXT_154 = ";" + NL;
  protected final String TEXT_155 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_156 = " = ";
  protected final String TEXT_157 = ".getFeatureID(";
  protected final String TEXT_158 = ") - ";
  protected final String TEXT_159 = ";" + NL;
  protected final String TEXT_160 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_161 = "public";
  protected final String TEXT_162 = "protected";
  protected final String TEXT_163 = " ";
  protected final String TEXT_164 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_165 = NL + "\t\t";
  protected final String TEXT_166 = " |= ";
  protected final String TEXT_167 = "_EFLAG";
  protected final String TEXT_168 = "_DEFAULT";
  protected final String TEXT_169 = ";";
  protected final String TEXT_170 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_171 = NL + "\t@Override";
  protected final String TEXT_172 = NL + "\tprotected ";
  protected final String TEXT_173 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_174 = ";" + NL + "\t}" + NL;
  protected final String TEXT_175 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_176 = NL + "\t@Override";
  protected final String TEXT_177 = NL + "\tprotected int eStaticFeatureCount()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_178 = ";" + NL + "\t}" + NL;
  protected final String TEXT_179 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_180 = NL + "\t";
  protected final String TEXT_181 = "[] ";
  protected final String TEXT_182 = "();" + NL;
  protected final String TEXT_183 = NL + "\tpublic ";
  protected final String TEXT_184 = "[] ";
  protected final String TEXT_185 = "()" + NL + "\t{";
  protected final String TEXT_186 = NL + "\t\t";
  protected final String TEXT_187 = " list = (";
  protected final String TEXT_188 = ")";
  protected final String TEXT_189 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_190 = "(";
  protected final String TEXT_191 = "[])";
  protected final String TEXT_192 = "_EEMPTY_ARRAY;";
  protected final String TEXT_193 = NL + "\t\tif (";
  protected final String TEXT_194 = " == null || ";
  protected final String TEXT_195 = ".isEmpty()) return ";
  protected final String TEXT_196 = "(";
  protected final String TEXT_197 = "[])";
  protected final String TEXT_198 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_199 = " list = (";
  protected final String TEXT_200 = ")";
  protected final String TEXT_201 = ";";
  protected final String TEXT_202 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_203 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_204 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_205 = NL + "\t";
  protected final String TEXT_206 = " get";
  protected final String TEXT_207 = "(int index);" + NL;
  protected final String TEXT_208 = NL + "\tpublic ";
  protected final String TEXT_209 = " get";
  protected final String TEXT_210 = "(int index)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_211 = "(";
  protected final String TEXT_212 = ")";
  protected final String TEXT_213 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_214 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_215 = NL + "\tint get";
  protected final String TEXT_216 = "Length();" + NL;
  protected final String TEXT_217 = NL + "\tpublic int get";
  protected final String TEXT_218 = "Length()" + NL + "\t{";
  protected final String TEXT_219 = NL + "\t\treturn ";
  protected final String TEXT_220 = "().size();";
  protected final String TEXT_221 = NL + "\t\treturn ";
  protected final String TEXT_222 = " == null ? 0 : ";
  protected final String TEXT_223 = ".size();";
  protected final String TEXT_224 = NL + "\t}" + NL;
  protected final String TEXT_225 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_226 = NL + "\tvoid set";
  protected final String TEXT_227 = "(";
  protected final String TEXT_228 = "[] new";
  protected final String TEXT_229 = ");" + NL;
  protected final String TEXT_230 = NL + "\tpublic void set";
  protected final String TEXT_231 = "(";
  protected final String TEXT_232 = "[] new";
  protected final String TEXT_233 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_234 = ")";
  protected final String TEXT_235 = "()).setData(new";
  protected final String TEXT_236 = ".length, new";
  protected final String TEXT_237 = ");" + NL + "\t}" + NL;
  protected final String TEXT_238 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_239 = NL + "\tvoid set";
  protected final String TEXT_240 = "(int index, ";
  protected final String TEXT_241 = " element);" + NL;
  protected final String TEXT_242 = NL + "\tpublic void set";
  protected final String TEXT_243 = "(int index, ";
  protected final String TEXT_244 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_245 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_246 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_247 = "</b></em>' ";
  protected final String TEXT_248 = ".";
  protected final String TEXT_249 = NL + "\t * The key is of type ";
  protected final String TEXT_250 = "list of {@link ";
  protected final String TEXT_251 = "}";
  protected final String TEXT_252 = "{@link ";
  protected final String TEXT_253 = "}";
  protected final String TEXT_254 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_255 = "list of {@link ";
  protected final String TEXT_256 = "}";
  protected final String TEXT_257 = "{@link ";
  protected final String TEXT_258 = "}";
  protected final String TEXT_259 = ",";
  protected final String TEXT_260 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_261 = "}";
  protected final String TEXT_262 = ".";
  protected final String TEXT_263 = NL + "\t * The default value is <code>";
  protected final String TEXT_264 = "</code>.";
  protected final String TEXT_265 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_266 = "}.";
  protected final String TEXT_267 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_268 = "#";
  protected final String TEXT_269 = " <em>";
  protected final String TEXT_270 = "</em>}'.";
  protected final String TEXT_271 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_272 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_273 = "</em>' ";
  protected final String TEXT_274 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_275 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_276 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_277 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_278 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_279 = "</em>' ";
  protected final String TEXT_280 = ".";
  protected final String TEXT_281 = NL + "\t * @see ";
  protected final String TEXT_282 = NL + "\t * @see #isSet";
  protected final String TEXT_283 = "()";
  protected final String TEXT_284 = NL + "\t * @see #unset";
  protected final String TEXT_285 = "()";
  protected final String TEXT_286 = NL + "\t * @see #set";
  protected final String TEXT_287 = "(";
  protected final String TEXT_288 = ")";
  protected final String TEXT_289 = NL + "\t * @see ";
  protected final String TEXT_290 = "#get";
  protected final String TEXT_291 = "()";
  protected final String TEXT_292 = NL + "\t * @see ";
  protected final String TEXT_293 = "#";
  protected final String TEXT_294 = NL + "\t * @model ";
  protected final String TEXT_295 = NL + "\t *        ";
  protected final String TEXT_296 = NL + "\t * @model";
  protected final String TEXT_297 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_298 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_299 = NL + "\t";
  protected final String TEXT_300 = " ";
  protected final String TEXT_301 = "();" + NL;
  protected final String TEXT_302 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_303 = NL + "\tpublic ";
  protected final String TEXT_304 = " ";
  protected final String TEXT_305 = "_";
  protected final String TEXT_306 = "()" + NL + "\t{";
  protected final String TEXT_307 = NL + "\t\treturn ";
  protected final String TEXT_308 = "(";
  protected final String TEXT_309 = "(";
  protected final String TEXT_310 = ")eDynamicGet(";
  protected final String TEXT_311 = ", ";
  protected final String TEXT_312 = ", true, ";
  protected final String TEXT_313 = ")";
  protected final String TEXT_314 = ").";
  protected final String TEXT_315 = "()";
  protected final String TEXT_316 = ";";
  protected final String TEXT_317 = NL + "\t\treturn ";
  protected final String TEXT_318 = "(";
  protected final String TEXT_319 = "(";
  protected final String TEXT_320 = ")eGet(";
  protected final String TEXT_321 = ", true)";
  protected final String TEXT_322 = ").";
  protected final String TEXT_323 = "()";
  protected final String TEXT_324 = ";";
  protected final String TEXT_325 = NL + "\t\t";
  protected final String TEXT_326 = " ";
  protected final String TEXT_327 = " = (";
  protected final String TEXT_328 = ")eVirtualGet(";
  protected final String TEXT_329 = ");";
  protected final String TEXT_330 = NL + "\t\tif (";
  protected final String TEXT_331 = " == null)" + NL + "\t\t{";
  protected final String TEXT_332 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_333 = ", ";
  protected final String TEXT_334 = " = new ";
  protected final String TEXT_335 = ");";
  protected final String TEXT_336 = NL + "\t\t\t";
  protected final String TEXT_337 = " = new ";
  protected final String TEXT_338 = ";";
  protected final String TEXT_339 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_340 = ";";
  protected final String TEXT_341 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_342 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_343 = ")eContainer();";
  protected final String TEXT_344 = NL + "\t\t";
  protected final String TEXT_345 = " ";
  protected final String TEXT_346 = " = (";
  protected final String TEXT_347 = ")eVirtualGet(";
  protected final String TEXT_348 = ", ";
  protected final String TEXT_349 = ");";
  protected final String TEXT_350 = NL + "\t\tif (";
  protected final String TEXT_351 = " != null && ";
  protected final String TEXT_352 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_353 = " old";
  protected final String TEXT_354 = " = (";
  protected final String TEXT_355 = ")";
  protected final String TEXT_356 = ";" + NL + "\t\t\t";
  protected final String TEXT_357 = " = ";
  protected final String TEXT_358 = "eResolveProxy(old";
  protected final String TEXT_359 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_360 = " != old";
  protected final String TEXT_361 = ")" + NL + "\t\t\t{";
  protected final String TEXT_362 = NL + "\t\t\t\t";
  protected final String TEXT_363 = " new";
  protected final String TEXT_364 = " = (";
  protected final String TEXT_365 = ")";
  protected final String TEXT_366 = ";";
  protected final String TEXT_367 = NL + "\t\t\t\t";
  protected final String TEXT_368 = " msgs = old";
  protected final String TEXT_369 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_370 = ", null, null);";
  protected final String TEXT_371 = NL + "\t\t\t\t";
  protected final String TEXT_372 = " msgs =  old";
  protected final String TEXT_373 = ".eInverseRemove(this, ";
  protected final String TEXT_374 = ", ";
  protected final String TEXT_375 = ".class, null);";
  protected final String TEXT_376 = NL + "\t\t\t\tif (new";
  protected final String TEXT_377 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_378 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_379 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_380 = ", null, msgs);";
  protected final String TEXT_381 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_382 = ".eInverseAdd(this, ";
  protected final String TEXT_383 = ", ";
  protected final String TEXT_384 = ".class, msgs);";
  protected final String TEXT_385 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_386 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_387 = ", ";
  protected final String TEXT_388 = ");";
  protected final String TEXT_389 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_390 = "(this, ";
  protected final String TEXT_391 = ".RESOLVE, ";
  protected final String TEXT_392 = ", old";
  protected final String TEXT_393 = ", ";
  protected final String TEXT_394 = "));";
  protected final String TEXT_395 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_396 = NL + "\t\treturn (";
  protected final String TEXT_397 = ")eVirtualGet(";
  protected final String TEXT_398 = ", ";
  protected final String TEXT_399 = ");";
  protected final String TEXT_400 = NL + "\t\treturn (";
  protected final String TEXT_401 = " & ";
  protected final String TEXT_402 = "_EFLAG) != 0;";
  protected final String TEXT_403 = NL + "\t\treturn ";
  protected final String TEXT_404 = "_EFLAG_VALUES[(";
  protected final String TEXT_405 = " & ";
  protected final String TEXT_406 = "_EFLAG) >>> ";
  protected final String TEXT_407 = "_EFLAG_OFFSET];";
  protected final String TEXT_408 = NL + "\t\treturn ";
  protected final String TEXT_409 = ";";
  protected final String TEXT_410 = NL + "\t\t";
  protected final String TEXT_411 = " ";
  protected final String TEXT_412 = " = basicGet";
  protected final String TEXT_413 = "();" + NL + "\t\treturn ";
  protected final String TEXT_414 = " != null && ";
  protected final String TEXT_415 = ".eIsProxy() ? ";
  protected final String TEXT_416 = "eResolveProxy((";
  protected final String TEXT_417 = ")";
  protected final String TEXT_418 = ") : ";
  protected final String TEXT_419 = ";";
  protected final String TEXT_420 = NL + "\t\treturn new ";
  protected final String TEXT_421 = "((";
  protected final String TEXT_422 = ".Internal)((";
  protected final String TEXT_423 = ".Internal.Wrapper)get";
  protected final String TEXT_424 = "()).featureMap().";
  protected final String TEXT_425 = "list(";
  protected final String TEXT_426 = "));";
  protected final String TEXT_427 = NL + "\t\treturn (";
  protected final String TEXT_428 = ")get";
  protected final String TEXT_429 = "().";
  protected final String TEXT_430 = "list(";
  protected final String TEXT_431 = ");";
  protected final String TEXT_432 = NL + "\t\treturn ((";
  protected final String TEXT_433 = ".Internal.Wrapper)get";
  protected final String TEXT_434 = "()).featureMap().list(";
  protected final String TEXT_435 = ");";
  protected final String TEXT_436 = NL + "\t\treturn get";
  protected final String TEXT_437 = "().list(";
  protected final String TEXT_438 = ");";
  protected final String TEXT_439 = NL + "\t\treturn ";
  protected final String TEXT_440 = "(";
  protected final String TEXT_441 = "(";
  protected final String TEXT_442 = ")";
  protected final String TEXT_443 = "((";
  protected final String TEXT_444 = ".Internal.Wrapper)get";
  protected final String TEXT_445 = "()).featureMap().get(";
  protected final String TEXT_446 = ", true)";
  protected final String TEXT_447 = ").";
  protected final String TEXT_448 = "()";
  protected final String TEXT_449 = ";";
  protected final String TEXT_450 = NL + "\t\treturn ";
  protected final String TEXT_451 = "(";
  protected final String TEXT_452 = "(";
  protected final String TEXT_453 = ")";
  protected final String TEXT_454 = "get";
  protected final String TEXT_455 = "().get(";
  protected final String TEXT_456 = ", true)";
  protected final String TEXT_457 = ").";
  protected final String TEXT_458 = "()";
  protected final String TEXT_459 = ";";
  protected final String TEXT_460 = NL + "\t\t";
  protected final String TEXT_461 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_462 = "' ";
  protected final String TEXT_463 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT";
  protected final String TEXT_464 = NL + "\t\t// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting" + NL + "\t\t// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.";
  protected final String TEXT_465 = "EcoreEMap";
  protected final String TEXT_466 = "BasicFeatureMap";
  protected final String TEXT_467 = "EcoreEList";
  protected final String TEXT_468 = " should be used.";
  protected final String TEXT_469 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_470 = NL + "\t}" + NL;
  protected final String TEXT_471 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_472 = NL + "\tpublic ";
  protected final String TEXT_473 = " basicGet";
  protected final String TEXT_474 = "()" + NL + "\t{";
  protected final String TEXT_475 = NL + "\t\treturn (";
  protected final String TEXT_476 = ")eDynamicGet(";
  protected final String TEXT_477 = ", ";
  protected final String TEXT_478 = ", false, ";
  protected final String TEXT_479 = ");";
  protected final String TEXT_480 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_481 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_482 = ")eInternalContainer();";
  protected final String TEXT_483 = NL + "\t\treturn (";
  protected final String TEXT_484 = ")eVirtualGet(";
  protected final String TEXT_485 = ");";
  protected final String TEXT_486 = NL + "\t\treturn ";
  protected final String TEXT_487 = ";";
  protected final String TEXT_488 = NL + "\t\treturn (";
  protected final String TEXT_489 = ")((";
  protected final String TEXT_490 = ".Internal.Wrapper)get";
  protected final String TEXT_491 = "()).featureMap().get(";
  protected final String TEXT_492 = ", false);";
  protected final String TEXT_493 = NL + "\t\treturn (";
  protected final String TEXT_494 = ")get";
  protected final String TEXT_495 = "().get(";
  protected final String TEXT_496 = ", false);";
  protected final String TEXT_497 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_498 = "' ";
  protected final String TEXT_499 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_500 = NL + "\t}" + NL;
  protected final String TEXT_501 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_502 = NL + "\tpublic ";
  protected final String TEXT_503 = " basicSet";
  protected final String TEXT_504 = "(";
  protected final String TEXT_505 = " new";
  protected final String TEXT_506 = ", ";
  protected final String TEXT_507 = " msgs)" + NL + "\t{";
  protected final String TEXT_508 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_509 = ")new";
  protected final String TEXT_510 = ", ";
  protected final String TEXT_511 = ", msgs);";
  protected final String TEXT_512 = NL + "\t\treturn msgs;";
  protected final String TEXT_513 = NL + "\t\tmsgs = eDynamicInverseAdd((";
  protected final String TEXT_514 = ")new";
  protected final String TEXT_515 = ", ";
  protected final String TEXT_516 = ", msgs);";
  protected final String TEXT_517 = NL + "\t\treturn msgs;";
  protected final String TEXT_518 = NL + "\t\tObject old";
  protected final String TEXT_519 = " = eVirtualSet(";
  protected final String TEXT_520 = ", new";
  protected final String TEXT_521 = ");";
  protected final String TEXT_522 = NL + "\t\t";
  protected final String TEXT_523 = " old";
  protected final String TEXT_524 = " = ";
  protected final String TEXT_525 = ";" + NL + "\t\t";
  protected final String TEXT_526 = " = new";
  protected final String TEXT_527 = ";";
  protected final String TEXT_528 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_529 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_530 = NL + "\t\tboolean old";
  protected final String TEXT_531 = "ESet = (";
  protected final String TEXT_532 = " & ";
  protected final String TEXT_533 = "_ESETFLAG) != 0;";
  protected final String TEXT_534 = NL + "\t\t";
  protected final String TEXT_535 = " |= ";
  protected final String TEXT_536 = "_ESETFLAG;";
  protected final String TEXT_537 = NL + "\t\tboolean old";
  protected final String TEXT_538 = "ESet = ";
  protected final String TEXT_539 = "ESet;";
  protected final String TEXT_540 = NL + "\t\t";
  protected final String TEXT_541 = "ESet = true;";
  protected final String TEXT_542 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_543 = NL + "\t\t\t";
  protected final String TEXT_544 = " notification = new ";
  protected final String TEXT_545 = "(this, ";
  protected final String TEXT_546 = ".SET, ";
  protected final String TEXT_547 = ", ";
  protected final String TEXT_548 = "isSetChange ? null : old";
  protected final String TEXT_549 = "old";
  protected final String TEXT_550 = ", new";
  protected final String TEXT_551 = ", ";
  protected final String TEXT_552 = "isSetChange";
  protected final String TEXT_553 = "!old";
  protected final String TEXT_554 = "ESet";
  protected final String TEXT_555 = ");";
  protected final String TEXT_556 = NL + "\t\t\t";
  protected final String TEXT_557 = " notification = new ";
  protected final String TEXT_558 = "(this, ";
  protected final String TEXT_559 = ".SET, ";
  protected final String TEXT_560 = ", ";
  protected final String TEXT_561 = "old";
  protected final String TEXT_562 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_563 = "old";
  protected final String TEXT_564 = ", new";
  protected final String TEXT_565 = ");";
  protected final String TEXT_566 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_567 = NL + "\t\treturn msgs;";
  protected final String TEXT_568 = NL + "\t\treturn ((";
  protected final String TEXT_569 = ".Internal)((";
  protected final String TEXT_570 = ".Internal.Wrapper)get";
  protected final String TEXT_571 = "()).featureMap()).basicAdd(";
  protected final String TEXT_572 = ", new";
  protected final String TEXT_573 = ", msgs);";
  protected final String TEXT_574 = NL + "\t\treturn ((";
  protected final String TEXT_575 = ".Internal)get";
  protected final String TEXT_576 = "()).basicAdd(";
  protected final String TEXT_577 = ", new";
  protected final String TEXT_578 = ", msgs);";
  protected final String TEXT_579 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_580 = "' ";
  protected final String TEXT_581 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_582 = NL + "\t}" + NL;
  protected final String TEXT_583 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_584 = "#";
  protected final String TEXT_585 = " <em>";
  protected final String TEXT_586 = "</em>}' ";
  protected final String TEXT_587 = ".";
  protected final String TEXT_588 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_589 = "</em>' ";
  protected final String TEXT_590 = ".";
  protected final String TEXT_591 = NL + "\t * @see ";
  protected final String TEXT_592 = NL + "\t * @see #isSet";
  protected final String TEXT_593 = "()";
  protected final String TEXT_594 = NL + "\t * @see #unset";
  protected final String TEXT_595 = "()";
  protected final String TEXT_596 = NL + "\t * @see #";
  protected final String TEXT_597 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_598 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_599 = NL + "\tvoid set";
  protected final String TEXT_600 = "(";
  protected final String TEXT_601 = " value);" + NL;
  protected final String TEXT_602 = NL + "\tpublic void set";
  protected final String TEXT_603 = "_";
  protected final String TEXT_604 = "(";
  protected final String TEXT_605 = " ";
  protected final String TEXT_606 = ")" + NL + "\t{";
  protected final String TEXT_607 = NL + "\t\teDynamicSet(";
  protected final String TEXT_608 = ", ";
  protected final String TEXT_609 = ", ";
  protected final String TEXT_610 = "new ";
  protected final String TEXT_611 = "(";
  protected final String TEXT_612 = "new";
  protected final String TEXT_613 = ")";
  protected final String TEXT_614 = ");";
  protected final String TEXT_615 = NL + "\t\teSet(";
  protected final String TEXT_616 = ", ";
  protected final String TEXT_617 = "new ";
  protected final String TEXT_618 = "(";
  protected final String TEXT_619 = "new";
  protected final String TEXT_620 = ")";
  protected final String TEXT_621 = ");";
  protected final String TEXT_622 = NL + "\t\tif (new";
  protected final String TEXT_623 = " != eInternalContainer() || (eContainerFeatureID() != ";
  protected final String TEXT_624 = " && new";
  protected final String TEXT_625 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_626 = ".isAncestor(this, ";
  protected final String TEXT_627 = "new";
  protected final String TEXT_628 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_629 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_630 = NL + "\t\t\t";
  protected final String TEXT_631 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_632 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_633 = ")new";
  protected final String TEXT_634 = ").eInverseAdd(this, ";
  protected final String TEXT_635 = ", ";
  protected final String TEXT_636 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_637 = "(";
  protected final String TEXT_638 = "new";
  protected final String TEXT_639 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_640 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_641 = "(this, ";
  protected final String TEXT_642 = ".SET, ";
  protected final String TEXT_643 = ", new";
  protected final String TEXT_644 = ", new";
  protected final String TEXT_645 = "));";
  protected final String TEXT_646 = NL + "\t\t";
  protected final String TEXT_647 = " ";
  protected final String TEXT_648 = " = (";
  protected final String TEXT_649 = ")eVirtualGet(";
  protected final String TEXT_650 = ");";
  protected final String TEXT_651 = NL + "\t\tif (new";
  protected final String TEXT_652 = " != ";
  protected final String TEXT_653 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_654 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_655 = " != null)";
  protected final String TEXT_656 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_657 = ")";
  protected final String TEXT_658 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_659 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_660 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_661 = ")new";
  protected final String TEXT_662 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_663 = ", null, msgs);";
  protected final String TEXT_664 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_665 = ")";
  protected final String TEXT_666 = ").eInverseRemove(this, ";
  protected final String TEXT_667 = ", ";
  protected final String TEXT_668 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_669 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_670 = ")new";
  protected final String TEXT_671 = ").eInverseAdd(this, ";
  protected final String TEXT_672 = ", ";
  protected final String TEXT_673 = ".class, msgs);";
  protected final String TEXT_674 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_675 = "(";
  protected final String TEXT_676 = "new";
  protected final String TEXT_677 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_678 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_679 = NL + "\t\t\tboolean old";
  protected final String TEXT_680 = "ESet = eVirtualIsSet(";
  protected final String TEXT_681 = ");";
  protected final String TEXT_682 = NL + "\t\t\tboolean old";
  protected final String TEXT_683 = "ESet = (";
  protected final String TEXT_684 = " & ";
  protected final String TEXT_685 = "_ESETFLAG) != 0;";
  protected final String TEXT_686 = NL + "\t\t\t";
  protected final String TEXT_687 = " |= ";
  protected final String TEXT_688 = "_ESETFLAG;";
  protected final String TEXT_689 = NL + "\t\t\tboolean old";
  protected final String TEXT_690 = "ESet = ";
  protected final String TEXT_691 = "ESet;";
  protected final String TEXT_692 = NL + "\t\t\t";
  protected final String TEXT_693 = "ESet = true;";
  protected final String TEXT_694 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_695 = "(this, ";
  protected final String TEXT_696 = ".SET, ";
  protected final String TEXT_697 = ", new";
  protected final String TEXT_698 = ", new";
  protected final String TEXT_699 = ", !old";
  protected final String TEXT_700 = "ESet));";
  protected final String TEXT_701 = NL + "\t\t}";
  protected final String TEXT_702 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_703 = "(this, ";
  protected final String TEXT_704 = ".SET, ";
  protected final String TEXT_705 = ", new";
  protected final String TEXT_706 = ", new";
  protected final String TEXT_707 = "));";
  protected final String TEXT_708 = NL + "\t\t";
  protected final String TEXT_709 = " old";
  protected final String TEXT_710 = " = (";
  protected final String TEXT_711 = " & ";
  protected final String TEXT_712 = "_EFLAG) != 0;";
  protected final String TEXT_713 = NL + "\t\t";
  protected final String TEXT_714 = " old";
  protected final String TEXT_715 = " = ";
  protected final String TEXT_716 = "_EFLAG_VALUES[(";
  protected final String TEXT_717 = " & ";
  protected final String TEXT_718 = "_EFLAG) >>> ";
  protected final String TEXT_719 = "_EFLAG_OFFSET];";
  protected final String TEXT_720 = NL + "\t\tif (new";
  protected final String TEXT_721 = ") ";
  protected final String TEXT_722 = " |= ";
  protected final String TEXT_723 = "_EFLAG; else ";
  protected final String TEXT_724 = " &= ~";
  protected final String TEXT_725 = "_EFLAG;";
  protected final String TEXT_726 = NL + "\t\tif (new";
  protected final String TEXT_727 = " == null) new";
  protected final String TEXT_728 = " = ";
  protected final String TEXT_729 = "_EDEFAULT;" + NL + "\t\t";
  protected final String TEXT_730 = " = ";
  protected final String TEXT_731 = " & ~";
  protected final String TEXT_732 = "_EFLAG | ";
  protected final String TEXT_733 = "new";
  protected final String TEXT_734 = ".ordinal()";
  protected final String TEXT_735 = ".VALUES.indexOf(new";
  protected final String TEXT_736 = ")";
  protected final String TEXT_737 = " << ";
  protected final String TEXT_738 = "_EFLAG_OFFSET;";
  protected final String TEXT_739 = NL + "\t\t";
  protected final String TEXT_740 = " old";
  protected final String TEXT_741 = " = ";
  protected final String TEXT_742 = ";";
  protected final String TEXT_743 = NL + "\t\t";
  protected final String TEXT_744 = " ";
  protected final String TEXT_745 = " = new";
  protected final String TEXT_746 = " == null ? ";
  protected final String TEXT_747 = " : new";
  protected final String TEXT_748 = ";";
  protected final String TEXT_749 = NL + "\t\t";
  protected final String TEXT_750 = " = new";
  protected final String TEXT_751 = " == null ? ";
  protected final String TEXT_752 = " : new";
  protected final String TEXT_753 = ";";
  protected final String TEXT_754 = NL + "\t\t";
  protected final String TEXT_755 = " ";
  protected final String TEXT_756 = " = ";
  protected final String TEXT_757 = "new";
  protected final String TEXT_758 = ";";
  protected final String TEXT_759 = NL + "\t\t";
  protected final String TEXT_760 = " = ";
  protected final String TEXT_761 = "new";
  protected final String TEXT_762 = ";";
  protected final String TEXT_763 = NL + "\t\tObject old";
  protected final String TEXT_764 = " = eVirtualSet(";
  protected final String TEXT_765 = ", ";
  protected final String TEXT_766 = ");";
  protected final String TEXT_767 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_768 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_769 = NL + "\t\tboolean old";
  protected final String TEXT_770 = "ESet = (";
  protected final String TEXT_771 = " & ";
  protected final String TEXT_772 = "_ESETFLAG) != 0;";
  protected final String TEXT_773 = NL + "\t\t";
  protected final String TEXT_774 = " |= ";
  protected final String TEXT_775 = "_ESETFLAG;";
  protected final String TEXT_776 = NL + "\t\tboolean old";
  protected final String TEXT_777 = "ESet = ";
  protected final String TEXT_778 = "ESet;";
  protected final String TEXT_779 = NL + "\t\t";
  protected final String TEXT_780 = "ESet = true;";
  protected final String TEXT_781 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_782 = "(this, ";
  protected final String TEXT_783 = ".SET, ";
  protected final String TEXT_784 = ", ";
  protected final String TEXT_785 = "isSetChange ? ";
  protected final String TEXT_786 = " : old";
  protected final String TEXT_787 = "old";
  protected final String TEXT_788 = ", ";
  protected final String TEXT_789 = "new";
  protected final String TEXT_790 = ", ";
  protected final String TEXT_791 = "isSetChange";
  protected final String TEXT_792 = "!old";
  protected final String TEXT_793 = "ESet";
  protected final String TEXT_794 = "));";
  protected final String TEXT_795 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_796 = "(this, ";
  protected final String TEXT_797 = ".SET, ";
  protected final String TEXT_798 = ", ";
  protected final String TEXT_799 = "old";
  protected final String TEXT_800 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_801 = " : old";
  protected final String TEXT_802 = "old";
  protected final String TEXT_803 = ", ";
  protected final String TEXT_804 = "new";
  protected final String TEXT_805 = "));";
  protected final String TEXT_806 = NL + "\t\t((";
  protected final String TEXT_807 = ".Internal)((";
  protected final String TEXT_808 = ".Internal.Wrapper)get";
  protected final String TEXT_809 = "()).featureMap()).set(";
  protected final String TEXT_810 = ", ";
  protected final String TEXT_811 = "new ";
  protected final String TEXT_812 = "(";
  protected final String TEXT_813 = "new";
  protected final String TEXT_814 = ")";
  protected final String TEXT_815 = ");";
  protected final String TEXT_816 = NL + "\t\t((";
  protected final String TEXT_817 = ".Internal)get";
  protected final String TEXT_818 = "()).set(";
  protected final String TEXT_819 = ", ";
  protected final String TEXT_820 = "new ";
  protected final String TEXT_821 = "(";
  protected final String TEXT_822 = "new";
  protected final String TEXT_823 = ")";
  protected final String TEXT_824 = ");";
  protected final String TEXT_825 = NL + "\t\t";
  protected final String TEXT_826 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_827 = "' ";
  protected final String TEXT_828 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_829 = NL + "\t}" + NL;
  protected final String TEXT_830 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_831 = NL + "\tpublic ";
  protected final String TEXT_832 = " basicUnset";
  protected final String TEXT_833 = "(";
  protected final String TEXT_834 = " msgs)" + NL + "\t{";
  protected final String TEXT_835 = NL + "\t\treturn eDynamicInverseRemove((";
  protected final String TEXT_836 = ")";
  protected final String TEXT_837 = "basicGet";
  protected final String TEXT_838 = "(), ";
  protected final String TEXT_839 = ", msgs);";
  protected final String TEXT_840 = "Object old";
  protected final String TEXT_841 = " = ";
  protected final String TEXT_842 = "eVirtualUnset(";
  protected final String TEXT_843 = ");";
  protected final String TEXT_844 = NL + "\t\t";
  protected final String TEXT_845 = " old";
  protected final String TEXT_846 = " = ";
  protected final String TEXT_847 = ";";
  protected final String TEXT_848 = NL + "\t\t";
  protected final String TEXT_849 = " = null;";
  protected final String TEXT_850 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_851 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_852 = NL + "\t\tboolean old";
  protected final String TEXT_853 = "ESet = (";
  protected final String TEXT_854 = " & ";
  protected final String TEXT_855 = "_ESETFLAG) != 0;";
  protected final String TEXT_856 = NL + "\t\t";
  protected final String TEXT_857 = " &= ~";
  protected final String TEXT_858 = "_ESETFLAG;";
  protected final String TEXT_859 = NL + "\t\tboolean old";
  protected final String TEXT_860 = "ESet = ";
  protected final String TEXT_861 = "ESet;";
  protected final String TEXT_862 = NL + "\t\t";
  protected final String TEXT_863 = "ESet = false;";
  protected final String TEXT_864 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_865 = " notification = new ";
  protected final String TEXT_866 = "(this, ";
  protected final String TEXT_867 = ".UNSET, ";
  protected final String TEXT_868 = ", ";
  protected final String TEXT_869 = "isSetChange ? old";
  protected final String TEXT_870 = " : null";
  protected final String TEXT_871 = "old";
  protected final String TEXT_872 = ", null, ";
  protected final String TEXT_873 = "isSetChange";
  protected final String TEXT_874 = "old";
  protected final String TEXT_875 = "ESet";
  protected final String TEXT_876 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_877 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_878 = "' ";
  protected final String TEXT_879 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_880 = NL + "\t}" + NL;
  protected final String TEXT_881 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_882 = "#";
  protected final String TEXT_883 = " <em>";
  protected final String TEXT_884 = "</em>}' ";
  protected final String TEXT_885 = ".";
  protected final String TEXT_886 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_887 = NL + "\t * @see #isSet";
  protected final String TEXT_888 = "()";
  protected final String TEXT_889 = NL + "\t * @see #";
  protected final String TEXT_890 = "()";
  protected final String TEXT_891 = NL + "\t * @see #set";
  protected final String TEXT_892 = "(";
  protected final String TEXT_893 = ")";
  protected final String TEXT_894 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_895 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_896 = NL + "\tvoid unset";
  protected final String TEXT_897 = "();" + NL;
  protected final String TEXT_898 = NL + "\tpublic void unset";
  protected final String TEXT_899 = "_";
  protected final String TEXT_900 = "()" + NL + "\t{";
  protected final String TEXT_901 = NL + "\t\teDynamicUnset(";
  protected final String TEXT_902 = ", ";
  protected final String TEXT_903 = ");";
  protected final String TEXT_904 = NL + "\t\teUnset(";
  protected final String TEXT_905 = ");";
  protected final String TEXT_906 = NL + "\t\t";
  protected final String TEXT_907 = " ";
  protected final String TEXT_908 = " = (";
  protected final String TEXT_909 = ")eVirtualGet(";
  protected final String TEXT_910 = ");";
  protected final String TEXT_911 = NL + "\t\tif (";
  protected final String TEXT_912 = " != null) ((";
  protected final String TEXT_913 = ".Unsettable";
  protected final String TEXT_914 = ")";
  protected final String TEXT_915 = ").unset();";
  protected final String TEXT_916 = NL + "\t\t";
  protected final String TEXT_917 = " ";
  protected final String TEXT_918 = " = (";
  protected final String TEXT_919 = ")eVirtualGet(";
  protected final String TEXT_920 = ");";
  protected final String TEXT_921 = NL + "\t\tif (";
  protected final String TEXT_922 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_923 = " msgs = null;";
  protected final String TEXT_924 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_925 = ")";
  protected final String TEXT_926 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_927 = ", null, msgs);";
  protected final String TEXT_928 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_929 = ")";
  protected final String TEXT_930 = ").eInverseRemove(this, ";
  protected final String TEXT_931 = ", ";
  protected final String TEXT_932 = ".class, msgs);";
  protected final String TEXT_933 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_934 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_935 = NL + "\t\t\tboolean old";
  protected final String TEXT_936 = "ESet = eVirtualIsSet(";
  protected final String TEXT_937 = ");";
  protected final String TEXT_938 = NL + "\t\t\tboolean old";
  protected final String TEXT_939 = "ESet = (";
  protected final String TEXT_940 = " & ";
  protected final String TEXT_941 = "_ESETFLAG) != 0;";
  protected final String TEXT_942 = NL + "\t\t\t";
  protected final String TEXT_943 = " &= ~";
  protected final String TEXT_944 = "_ESETFLAG;";
  protected final String TEXT_945 = NL + "\t\t\tboolean old";
  protected final String TEXT_946 = "ESet = ";
  protected final String TEXT_947 = "ESet;";
  protected final String TEXT_948 = NL + "\t\t\t";
  protected final String TEXT_949 = "ESet = false;";
  protected final String TEXT_950 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_951 = "(this, ";
  protected final String TEXT_952 = ".UNSET, ";
  protected final String TEXT_953 = ", null, null, old";
  protected final String TEXT_954 = "ESet));";
  protected final String TEXT_955 = NL + "\t\t}";
  protected final String TEXT_956 = NL + "\t\t";
  protected final String TEXT_957 = " old";
  protected final String TEXT_958 = " = (";
  protected final String TEXT_959 = " & ";
  protected final String TEXT_960 = "_EFLAG) != 0;";
  protected final String TEXT_961 = NL + "\t\t";
  protected final String TEXT_962 = " old";
  protected final String TEXT_963 = " = ";
  protected final String TEXT_964 = "_EFLAG_VALUES[(";
  protected final String TEXT_965 = " & ";
  protected final String TEXT_966 = "_EFLAG) >>> ";
  protected final String TEXT_967 = "_EFLAG_OFFSET];";
  protected final String TEXT_968 = NL + "\t\tObject old";
  protected final String TEXT_969 = " = eVirtualUnset(";
  protected final String TEXT_970 = ");";
  protected final String TEXT_971 = NL + "\t\t";
  protected final String TEXT_972 = " old";
  protected final String TEXT_973 = " = ";
  protected final String TEXT_974 = ";";
  protected final String TEXT_975 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_976 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_977 = NL + "\t\tboolean old";
  protected final String TEXT_978 = "ESet = (";
  protected final String TEXT_979 = " & ";
  protected final String TEXT_980 = "_ESETFLAG) != 0;";
  protected final String TEXT_981 = NL + "\t\tboolean old";
  protected final String TEXT_982 = "ESet = ";
  protected final String TEXT_983 = "ESet;";
  protected final String TEXT_984 = NL + "\t\t";
  protected final String TEXT_985 = " = null;";
  protected final String TEXT_986 = NL + "\t\t";
  protected final String TEXT_987 = " &= ~";
  protected final String TEXT_988 = "_ESETFLAG;";
  protected final String TEXT_989 = NL + "\t\t";
  protected final String TEXT_990 = "ESet = false;";
  protected final String TEXT_991 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_992 = "(this, ";
  protected final String TEXT_993 = ".UNSET, ";
  protected final String TEXT_994 = ", ";
  protected final String TEXT_995 = "isSetChange ? old";
  protected final String TEXT_996 = " : null";
  protected final String TEXT_997 = "old";
  protected final String TEXT_998 = ", null, ";
  protected final String TEXT_999 = "isSetChange";
  protected final String TEXT_1000 = "old";
  protected final String TEXT_1001 = "ESet";
  protected final String TEXT_1002 = "));";
  protected final String TEXT_1003 = NL + "\t\tif (";
  protected final String TEXT_1004 = ") ";
  protected final String TEXT_1005 = " |= ";
  protected final String TEXT_1006 = "_EFLAG; else ";
  protected final String TEXT_1007 = " &= ~";
  protected final String TEXT_1008 = "_EFLAG;";
  protected final String TEXT_1009 = NL + "\t\t";
  protected final String TEXT_1010 = " = ";
  protected final String TEXT_1011 = " & ~";
  protected final String TEXT_1012 = "_EFLAG | ";
  protected final String TEXT_1013 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1014 = NL + "\t\t";
  protected final String TEXT_1015 = " = ";
  protected final String TEXT_1016 = ";";
  protected final String TEXT_1017 = NL + "\t\t";
  protected final String TEXT_1018 = " &= ~";
  protected final String TEXT_1019 = "_ESETFLAG;";
  protected final String TEXT_1020 = NL + "\t\t";
  protected final String TEXT_1021 = "ESet = false;";
  protected final String TEXT_1022 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1023 = "(this, ";
  protected final String TEXT_1024 = ".UNSET, ";
  protected final String TEXT_1025 = ", ";
  protected final String TEXT_1026 = "isSetChange ? old";
  protected final String TEXT_1027 = " : ";
  protected final String TEXT_1028 = "old";
  protected final String TEXT_1029 = ", ";
  protected final String TEXT_1030 = ", ";
  protected final String TEXT_1031 = "isSetChange";
  protected final String TEXT_1032 = "old";
  protected final String TEXT_1033 = "ESet";
  protected final String TEXT_1034 = "));";
  protected final String TEXT_1035 = NL + "\t\t((";
  protected final String TEXT_1036 = ".Internal)((";
  protected final String TEXT_1037 = ".Internal.Wrapper)get";
  protected final String TEXT_1038 = "()).featureMap()).clear(";
  protected final String TEXT_1039 = ");";
  protected final String TEXT_1040 = NL + "\t\t((";
  protected final String TEXT_1041 = ".Internal)get";
  protected final String TEXT_1042 = "()).clear(";
  protected final String TEXT_1043 = ");";
  protected final String TEXT_1044 = NL + "\t\t";
  protected final String TEXT_1045 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1046 = "' ";
  protected final String TEXT_1047 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1048 = NL + "\t}" + NL;
  protected final String TEXT_1049 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1050 = "#";
  protected final String TEXT_1051 = " <em>";
  protected final String TEXT_1052 = "</em>}' ";
  protected final String TEXT_1053 = " is set.";
  protected final String TEXT_1054 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1055 = "</em>' ";
  protected final String TEXT_1056 = " is set.";
  protected final String TEXT_1057 = NL + "\t * @see #unset";
  protected final String TEXT_1058 = "()";
  protected final String TEXT_1059 = NL + "\t * @see #";
  protected final String TEXT_1060 = "()";
  protected final String TEXT_1061 = NL + "\t * @see #set";
  protected final String TEXT_1062 = "(";
  protected final String TEXT_1063 = ")";
  protected final String TEXT_1064 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1065 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1066 = NL + "\tboolean isSet";
  protected final String TEXT_1067 = "();" + NL;
  protected final String TEXT_1068 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1069 = "_";
  protected final String TEXT_1070 = "()" + NL + "\t{";
  protected final String TEXT_1071 = NL + "\t\treturn eDynamicIsSet(";
  protected final String TEXT_1072 = ", ";
  protected final String TEXT_1073 = ");";
  protected final String TEXT_1074 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1075 = ");";
  protected final String TEXT_1076 = NL + "\t\t";
  protected final String TEXT_1077 = " ";
  protected final String TEXT_1078 = " = (";
  protected final String TEXT_1079 = ")eVirtualGet(";
  protected final String TEXT_1080 = ");";
  protected final String TEXT_1081 = NL + "\t\treturn ";
  protected final String TEXT_1082 = " != null && ((";
  protected final String TEXT_1083 = ".Unsettable";
  protected final String TEXT_1084 = ")";
  protected final String TEXT_1085 = ").isSet();";
  protected final String TEXT_1086 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1087 = ");";
  protected final String TEXT_1088 = NL + "\t\treturn (";
  protected final String TEXT_1089 = " & ";
  protected final String TEXT_1090 = "_ESETFLAG) != 0;";
  protected final String TEXT_1091 = NL + "\t\treturn ";
  protected final String TEXT_1092 = "ESet;";
  protected final String TEXT_1093 = NL + "\t\treturn !((";
  protected final String TEXT_1094 = ".Internal)((";
  protected final String TEXT_1095 = ".Internal.Wrapper)get";
  protected final String TEXT_1096 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1097 = ");";
  protected final String TEXT_1098 = NL + "\t\treturn !((";
  protected final String TEXT_1099 = ".Internal)get";
  protected final String TEXT_1100 = "()).isEmpty(";
  protected final String TEXT_1101 = ");";
  protected final String TEXT_1102 = NL + "\t\t";
  protected final String TEXT_1103 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1104 = "' ";
  protected final String TEXT_1105 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1106 = NL + "\t}" + NL;
  protected final String TEXT_1107 = NL + "\t/**";
  protected final String TEXT_1108 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1109 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_1110 = NL + "\t * ";
  protected final String TEXT_1111 = NL + "\t * @param ";
  protected final String TEXT_1112 = NL + "\t *   ";
  protected final String TEXT_1113 = NL + "\t * @param ";
  protected final String TEXT_1114 = " ";
  protected final String TEXT_1115 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1116 = NL + "\t * @model ";
  protected final String TEXT_1117 = NL + "\t *        ";
  protected final String TEXT_1118 = NL + "\t * @model";
  protected final String TEXT_1119 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1120 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1121 = NL + "\t";
  protected final String TEXT_1122 = " ";
  protected final String TEXT_1123 = "(";
  protected final String TEXT_1124 = ")";
  protected final String TEXT_1125 = ";" + NL;
  protected final String TEXT_1126 = NL + "\tpublic ";
  protected final String TEXT_1127 = " ";
  protected final String TEXT_1128 = "(";
  protected final String TEXT_1129 = ")";
  protected final String TEXT_1130 = NL + "\t{";
  protected final String TEXT_1131 = NL + "\t\t";
  protected final String TEXT_1132 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1133 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1134 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1135 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1136 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1137 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1138 = ".";
  protected final String TEXT_1139 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1140 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1141 = "\", ";
  protected final String TEXT_1142 = ".getObjectLabel(this, ";
  protected final String TEXT_1143 = ") }),";
  protected final String TEXT_1144 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1145 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1146 = NL + "\t}" + NL;
  protected final String TEXT_1147 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1148 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1149 = NL + "\t@Override";
  protected final String TEXT_1150 = NL + "\tpublic ";
  protected final String TEXT_1151 = " eInverseAdd(";
  protected final String TEXT_1152 = " otherEnd, int featureID, ";
  protected final String TEXT_1153 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1154 = ")" + NL + "\t\t{";
  protected final String TEXT_1155 = NL + "\t\t\tcase ";
  protected final String TEXT_1156 = ":";
  protected final String TEXT_1157 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1158 = "(";
  protected final String TEXT_1159 = ".InternalMapView";
  protected final String TEXT_1160 = ")";
  protected final String TEXT_1161 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1162 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1163 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1164 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1165 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1166 = "((";
  protected final String TEXT_1167 = ")otherEnd, msgs);";
  protected final String TEXT_1168 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1169 = ", msgs);";
  protected final String TEXT_1170 = NL + "\t\t\t\t";
  protected final String TEXT_1171 = " ";
  protected final String TEXT_1172 = " = (";
  protected final String TEXT_1173 = ")eVirtualGet(";
  protected final String TEXT_1174 = ");";
  protected final String TEXT_1175 = NL + "\t\t\t\t";
  protected final String TEXT_1176 = " ";
  protected final String TEXT_1177 = " = ";
  protected final String TEXT_1178 = "basicGet";
  protected final String TEXT_1179 = "();";
  protected final String TEXT_1180 = NL + "\t\t\t\tif (";
  protected final String TEXT_1181 = " != null)";
  protected final String TEXT_1182 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1183 = ")";
  protected final String TEXT_1184 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1185 = ", null, msgs);";
  protected final String TEXT_1186 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1187 = ")";
  protected final String TEXT_1188 = ").eInverseRemove(this, ";
  protected final String TEXT_1189 = ", ";
  protected final String TEXT_1190 = ".class, msgs);";
  protected final String TEXT_1191 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1192 = "((";
  protected final String TEXT_1193 = ")otherEnd, msgs);";
  protected final String TEXT_1194 = NL + "\t\t}";
  protected final String TEXT_1195 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1196 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1197 = NL + "\t}" + NL;
  protected final String TEXT_1198 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1199 = NL + "\t@Override";
  protected final String TEXT_1200 = NL + "\tpublic ";
  protected final String TEXT_1201 = " eInverseRemove(";
  protected final String TEXT_1202 = " otherEnd, int featureID, ";
  protected final String TEXT_1203 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1204 = ")" + NL + "\t\t{";
  protected final String TEXT_1205 = NL + "\t\t\tcase ";
  protected final String TEXT_1206 = ":";
  protected final String TEXT_1207 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1208 = ")((";
  protected final String TEXT_1209 = ".InternalMapView";
  protected final String TEXT_1210 = ")";
  protected final String TEXT_1211 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1212 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1213 = ")((";
  protected final String TEXT_1214 = ".Internal.Wrapper)";
  protected final String TEXT_1215 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1216 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1217 = ")";
  protected final String TEXT_1218 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1219 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1220 = ", msgs);";
  protected final String TEXT_1221 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_1222 = "(msgs);";
  protected final String TEXT_1223 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1224 = "(null, msgs);";
  protected final String TEXT_1225 = NL + "\t\t}";
  protected final String TEXT_1226 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1227 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1228 = NL + "\t}" + NL;
  protected final String TEXT_1229 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1230 = NL + "\t@Override";
  protected final String TEXT_1231 = NL + "\tpublic ";
  protected final String TEXT_1232 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_1233 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID()";
  protected final String TEXT_1234 = ")" + NL + "\t\t{";
  protected final String TEXT_1235 = NL + "\t\t\tcase ";
  protected final String TEXT_1236 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1237 = ", ";
  protected final String TEXT_1238 = ".class, msgs);";
  protected final String TEXT_1239 = NL + "\t\t}";
  protected final String TEXT_1240 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_1241 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1242 = NL + "\t}" + NL;
  protected final String TEXT_1243 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1244 = NL + "\t@Override";
  protected final String TEXT_1245 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1246 = ")" + NL + "\t\t{";
  protected final String TEXT_1247 = NL + "\t\t\tcase ";
  protected final String TEXT_1248 = ":";
  protected final String TEXT_1249 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1250 = "();";
  protected final String TEXT_1251 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1252 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1253 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1254 = "(";
  protected final String TEXT_1255 = "());";
  protected final String TEXT_1256 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1257 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1258 = "();";
  protected final String TEXT_1259 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1260 = ".InternalMapView";
  protected final String TEXT_1261 = ")";
  protected final String TEXT_1262 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1263 = "();";
  protected final String TEXT_1264 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1265 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1266 = "().map();";
  protected final String TEXT_1267 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1268 = ".Internal.Wrapper)";
  protected final String TEXT_1269 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1270 = "();";
  protected final String TEXT_1271 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1272 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_1273 = ".Internal)";
  protected final String TEXT_1274 = "()).getWrapper();";
  protected final String TEXT_1275 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1276 = "();";
  protected final String TEXT_1277 = NL + "\t\t}";
  protected final String TEXT_1278 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_1279 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_1280 = NL + "\t}" + NL;
  protected final String TEXT_1281 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1282 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1283 = NL + "\t@Override";
  protected final String TEXT_1284 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1285 = ")" + NL + "\t\t{";
  protected final String TEXT_1286 = NL + "\t\t\tcase ";
  protected final String TEXT_1287 = ":";
  protected final String TEXT_1288 = NL + "\t\t\t\t((";
  protected final String TEXT_1289 = ".Internal)((";
  protected final String TEXT_1290 = ".Internal.Wrapper)";
  protected final String TEXT_1291 = "()).featureMap()).set(newValue);";
  protected final String TEXT_1292 = NL + "\t\t\t\t((";
  protected final String TEXT_1293 = ".Internal)";
  protected final String TEXT_1294 = "()).set(newValue);";
  protected final String TEXT_1295 = NL + "\t\t\t\t((";
  protected final String TEXT_1296 = ".Setting)((";
  protected final String TEXT_1297 = ".InternalMapView";
  protected final String TEXT_1298 = ")";
  protected final String TEXT_1299 = "()).eMap()).set(newValue);";
  protected final String TEXT_1300 = NL + "\t\t\t\t((";
  protected final String TEXT_1301 = ".Setting)";
  protected final String TEXT_1302 = "()).set(newValue);";
  protected final String TEXT_1303 = NL + "\t\t\t\t";
  protected final String TEXT_1304 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_1305 = "().addAll((";
  protected final String TEXT_1306 = "<? extends ";
  protected final String TEXT_1307 = ">";
  protected final String TEXT_1308 = ")newValue);";
  protected final String TEXT_1309 = NL + "\t\t\t\tset";
  protected final String TEXT_1310 = "(((";
  protected final String TEXT_1311 = ")newValue).";
  protected final String TEXT_1312 = "());";
  protected final String TEXT_1313 = NL + "\t\t\t\tset";
  protected final String TEXT_1314 = "(";
  protected final String TEXT_1315 = "(";
  protected final String TEXT_1316 = ")";
  protected final String TEXT_1317 = "newValue);";
  protected final String TEXT_1318 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1319 = NL + "\t\t}";
  protected final String TEXT_1320 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_1321 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_1322 = NL + "\t}" + NL;
  protected final String TEXT_1323 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1324 = NL + "\t@Override";
  protected final String TEXT_1325 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1326 = ")" + NL + "\t\t{";
  protected final String TEXT_1327 = NL + "\t\t\tcase ";
  protected final String TEXT_1328 = ":";
  protected final String TEXT_1329 = NL + "\t\t\t\t((";
  protected final String TEXT_1330 = ".Internal.Wrapper)";
  protected final String TEXT_1331 = "()).featureMap().clear();";
  protected final String TEXT_1332 = NL + "\t\t\t\t";
  protected final String TEXT_1333 = "().clear();";
  protected final String TEXT_1334 = NL + "\t\t\t\tunset";
  protected final String TEXT_1335 = "();";
  protected final String TEXT_1336 = NL + "\t\t\t\tset";
  protected final String TEXT_1337 = "((";
  protected final String TEXT_1338 = ")null);";
  protected final String TEXT_1339 = NL + "\t\t\t\tset";
  protected final String TEXT_1340 = "(";
  protected final String TEXT_1341 = ");";
  protected final String TEXT_1342 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1343 = NL + "\t\t}";
  protected final String TEXT_1344 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_1345 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_1346 = NL + "\t}" + NL;
  protected final String TEXT_1347 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1348 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1349 = NL + "\t@Override";
  protected final String TEXT_1350 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1351 = ")" + NL + "\t\t{";
  protected final String TEXT_1352 = NL + "\t\t\tcase ";
  protected final String TEXT_1353 = ":";
  protected final String TEXT_1354 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1355 = ".Internal.Wrapper)";
  protected final String TEXT_1356 = "()).featureMap().isEmpty();";
  protected final String TEXT_1357 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1358 = " != null && !";
  protected final String TEXT_1359 = ".featureMap().isEmpty();";
  protected final String TEXT_1360 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1361 = " != null && !";
  protected final String TEXT_1362 = ".isEmpty();";
  protected final String TEXT_1363 = NL + "\t\t\t\t";
  protected final String TEXT_1364 = " ";
  protected final String TEXT_1365 = " = (";
  protected final String TEXT_1366 = ")eVirtualGet(";
  protected final String TEXT_1367 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1368 = " != null && !";
  protected final String TEXT_1369 = ".isEmpty();";
  protected final String TEXT_1370 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1371 = "().isEmpty();";
  protected final String TEXT_1372 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1373 = "();";
  protected final String TEXT_1374 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1375 = " != null;";
  protected final String TEXT_1376 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1377 = ") != null;";
  protected final String TEXT_1378 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1379 = "() != null;";
  protected final String TEXT_1380 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1381 = " != null;";
  protected final String TEXT_1382 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1383 = ") != null;";
  protected final String TEXT_1384 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1385 = "() != null;";
  protected final String TEXT_1386 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1387 = " & ";
  protected final String TEXT_1388 = "_EFLAG) != 0) != ";
  protected final String TEXT_1389 = ";";
  protected final String TEXT_1390 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1391 = " & ";
  protected final String TEXT_1392 = "_EFLAG) != ";
  protected final String TEXT_1393 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1394 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1395 = " != ";
  protected final String TEXT_1396 = ";";
  protected final String TEXT_1397 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1398 = ", ";
  protected final String TEXT_1399 = ") != ";
  protected final String TEXT_1400 = ";";
  protected final String TEXT_1401 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1402 = "() != ";
  protected final String TEXT_1403 = ";";
  protected final String TEXT_1404 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1405 = " == null ? ";
  protected final String TEXT_1406 = " != null : !";
  protected final String TEXT_1407 = ".equals(";
  protected final String TEXT_1408 = ");";
  protected final String TEXT_1409 = NL + "\t\t\t\t";
  protected final String TEXT_1410 = " ";
  protected final String TEXT_1411 = " = (";
  protected final String TEXT_1412 = ")eVirtualGet(";
  protected final String TEXT_1413 = ", ";
  protected final String TEXT_1414 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1415 = " == null ? ";
  protected final String TEXT_1416 = " != null : !";
  protected final String TEXT_1417 = ".equals(";
  protected final String TEXT_1418 = ");";
  protected final String TEXT_1419 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1420 = " == null ? ";
  protected final String TEXT_1421 = "() != null : !";
  protected final String TEXT_1422 = ".equals(";
  protected final String TEXT_1423 = "());";
  protected final String TEXT_1424 = NL + "\t\t}";
  protected final String TEXT_1425 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_1426 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_1427 = NL + "\t}" + NL;
  protected final String TEXT_1428 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1429 = NL + "\t@Override";
  protected final String TEXT_1430 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_1431 = " baseClass)" + NL + "\t{";
  protected final String TEXT_1432 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1433 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_1434 = ")" + NL + "\t\t\t{";
  protected final String TEXT_1435 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1436 = ": return ";
  protected final String TEXT_1437 = ";";
  protected final String TEXT_1438 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1439 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_1440 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1441 = NL + "\t@Override";
  protected final String TEXT_1442 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_1443 = " baseClass)" + NL + "\t{";
  protected final String TEXT_1444 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1445 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1446 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1447 = ": return ";
  protected final String TEXT_1448 = ";";
  protected final String TEXT_1449 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1450 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1451 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_1452 = ")" + NL + "\t\t\t{";
  protected final String TEXT_1453 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1454 = ": return ";
  protected final String TEXT_1455 = ";";
  protected final String TEXT_1456 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1457 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_1458 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1459 = NL + "\t@Override";
  protected final String TEXT_1460 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1461 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1462 = NL + "\t@Override";
  protected final String TEXT_1463 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1464 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_1465 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1466 = NL + "\t@Override";
  protected final String TEXT_1467 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1468 = NL + "\t\t\tcase ";
  protected final String TEXT_1469 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1470 = ";";
  protected final String TEXT_1471 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1472 = NL + "\t@Override";
  protected final String TEXT_1473 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1474 = NL + "\t\t\tcase ";
  protected final String TEXT_1475 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_1476 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_1477 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_1478 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1479 = NL + "\t@Override";
  protected final String TEXT_1480 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_1481 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_1482 = ": \");";
  protected final String TEXT_1483 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_1484 = ": \");";
  protected final String TEXT_1485 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_1486 = ")) result.append(eVirtualGet(";
  protected final String TEXT_1487 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_1488 = NL + "\t\tif (";
  protected final String TEXT_1489 = "(";
  protected final String TEXT_1490 = " & ";
  protected final String TEXT_1491 = "_ESETFLAG) != 0";
  protected final String TEXT_1492 = "ESet";
  protected final String TEXT_1493 = ") result.append((";
  protected final String TEXT_1494 = " & ";
  protected final String TEXT_1495 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_1496 = NL + "\t\tif (";
  protected final String TEXT_1497 = "(";
  protected final String TEXT_1498 = " & ";
  protected final String TEXT_1499 = "_ESETFLAG) != 0";
  protected final String TEXT_1500 = "ESet";
  protected final String TEXT_1501 = ") result.append(";
  protected final String TEXT_1502 = "_EFLAG_VALUES[(";
  protected final String TEXT_1503 = " & ";
  protected final String TEXT_1504 = "_EFLAG) >>> ";
  protected final String TEXT_1505 = "_EFLAG_OFFSET]); else result.append(\"<unset>\");";
  protected final String TEXT_1506 = NL + "\t\tif (";
  protected final String TEXT_1507 = "(";
  protected final String TEXT_1508 = " & ";
  protected final String TEXT_1509 = "_ESETFLAG) != 0";
  protected final String TEXT_1510 = "ESet";
  protected final String TEXT_1511 = ") result.append(";
  protected final String TEXT_1512 = "); else result.append(\"<unset>\");";
  protected final String TEXT_1513 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_1514 = ", ";
  protected final String TEXT_1515 = "));";
  protected final String TEXT_1516 = NL + "\t\tresult.append((";
  protected final String TEXT_1517 = " & ";
  protected final String TEXT_1518 = "_EFLAG) != 0);";
  protected final String TEXT_1519 = NL + "\t\tresult.append(";
  protected final String TEXT_1520 = "_EFLAG_VALUES[(";
  protected final String TEXT_1521 = " & ";
  protected final String TEXT_1522 = "_EFLAG) >>> ";
  protected final String TEXT_1523 = "_EFLAG_OFFSET]);";
  protected final String TEXT_1524 = NL + "\t\tresult.append(";
  protected final String TEXT_1525 = ");";
  protected final String TEXT_1526 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_1527 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1528 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1529 = " getKey()" + NL + "\t{";
  protected final String TEXT_1530 = NL + "\t\treturn new ";
  protected final String TEXT_1531 = "(getTypedKey());";
  protected final String TEXT_1532 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_1533 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_1534 = " key)" + NL + "\t{";
  protected final String TEXT_1535 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_1536 = "(";
  protected final String TEXT_1537 = ")";
  protected final String TEXT_1538 = "key);";
  protected final String TEXT_1539 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_1540 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_1541 = ")key).";
  protected final String TEXT_1542 = "());";
  protected final String TEXT_1543 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_1544 = ")key);";
  protected final String TEXT_1545 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1546 = " getValue()" + NL + "\t{";
  protected final String TEXT_1547 = NL + "\t\treturn new ";
  protected final String TEXT_1548 = "(getTypedValue());";
  protected final String TEXT_1549 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_1550 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1551 = " setValue(";
  protected final String TEXT_1552 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1553 = " oldValue = getValue();";
  protected final String TEXT_1554 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_1555 = "(";
  protected final String TEXT_1556 = ")";
  protected final String TEXT_1557 = "value);";
  protected final String TEXT_1558 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_1559 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_1560 = ")value).";
  protected final String TEXT_1561 = "());";
  protected final String TEXT_1562 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_1563 = ")value);";
  protected final String TEXT_1564 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1565 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1566 = NL + "\tpublic ";
  protected final String TEXT_1567 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1568 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_1569 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_1570 = NL + "} //";
  protected final String TEXT_1571 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

    final GenClass genClass = (GenClass)((Object[])argument)[0]; final GenPackage genPackage = genClass.getGenPackage(); final GenModel genModel=genPackage.getGenModel();
    final boolean isJDK50 = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50;
    final boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); final boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
    final String publicStaticFinalFlag = isImplementation ? "public static final " : "";
    final String singleWildcard = isJDK50 ? "<?>" : "";
    final String negativeOffsetCorrection = genClass.hasOffsetCorrection() ? " - " + genClass.getOffsetCorrectionField(null) : "";
    final String positiveOffsetCorrection = genClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(null) : "";
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_4);
    }}
    stringBuffer.append(TEXT_5);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_6);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_7);
    if (isInterface) {
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_9);
    } else {
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_11);
    }
    stringBuffer.append(TEXT_12);
    genModel.markImportLocation(stringBuffer, genPackage);
    if (isImplementation) { genClass.addClassPsuedoImports(); }
    stringBuffer.append(TEXT_13);
    if (isInterface) {
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_15);
    if (genClass.hasDocumentation()) {
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genClass.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_17);
    }
    stringBuffer.append(TEXT_18);
    if (!genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_19);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_23);
    }
    }
    stringBuffer.append(TEXT_24);
    }
    stringBuffer.append(TEXT_25);
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_28);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genClass.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_29);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_30);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_31);
    }}
    if (genClass.needsRootExtendsInterfaceExtendsTag()) {
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genModel.getImportedName(genModel.getRootExtendsInterface()));
    }
    stringBuffer.append(TEXT_33);
    } else {
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_35);
    if (!genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_36);
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_40);
    }
    stringBuffer.append(TEXT_41);
    }
    stringBuffer.append(TEXT_42);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_43);
    if (genClass.isAbstract()) {
    stringBuffer.append(TEXT_44);
    }
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getClassExtends());
    stringBuffer.append(genClass.getClassImplements());
    } else {
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getInterfaceExtends());
    }
    stringBuffer.append(TEXT_47);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_48);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_51);
    }
    if (isImplementation && genModel.getDriverNumber() != null) {
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genModel.getDriverNumber());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_55);
    }
    if (isImplementation && genClass.isJavaIOSerializable()) {
    stringBuffer.append(TEXT_56);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_57);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_58);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) {
    for (String eVirtualIndexBitField : eVirtualIndexBitFields) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(eVirtualIndexBitField);
    stringBuffer.append(TEXT_60);
    }
    }
    }
    }
    if (isImplementation && genClass.isModelRoot() && genModel.isBooleanFlagsEnabled() && genModel.getBooleanFlagsReservedBits() == -1) {
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genModel.getBooleanFlagsField());
    stringBuffer.append(TEXT_62);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getDeclaredFieldGenFeatures()) {
    if (genFeature.isListType() || genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_69);
    }
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_73);
    if (genFeature.getQualifiedListItemType(genClass).contains("<")) {
    stringBuffer.append(TEXT_74);
    }
    stringBuffer.append(TEXT_75);
    stringBuffer.append(rawListItemType);
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_78);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_79);
    }
    } else {
    if (genFeature.hasEDefault() && (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable()))) { String staticDefaultValue = genFeature.getStaticDefaultValue();
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_84);
    if (genModel.useGenerics() && genFeature.isListDataType() && genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_85);
    }
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genFeature.getEDefault());
    if ("".equals(staticDefaultValue)) {
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genFeature.getEcoreFeature().getDefaultValueLiteral());
    stringBuffer.append(TEXT_89);
    } else {
    stringBuffer.append(TEXT_90);
    stringBuffer.append(staticDefaultValue);
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genModel.getNonNLS(staticDefaultValue));
    }
    stringBuffer.append(TEXT_92);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) { int flagIndex = genClass.getFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_94);
    }
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(flagIndex % 32);
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_104);
    if (isJDK50) {
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_105);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_107);
    }
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genFeature.getTypeGenClassifier().getFormattedName());
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_113);
    if (isJDK50) {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_114);
    } else {
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_119);
    }
    stringBuffer.append(TEXT_120);
    }
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genClass.getFlagSize(genFeature) > 1 ? "s" : "");
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genClass.getFlagMask(genFeature));
    stringBuffer.append(TEXT_128);
    if (genFeature.isEnumType()) {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_129);
    } else {
    stringBuffer.append(flagIndex % 32);
    }
    stringBuffer.append(TEXT_130);
    } else {
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getSafeName());
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_138);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) { int flagIndex = genClass.getESetFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_140);
    }
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_144);
    stringBuffer.append(flagIndex % 32 );
    stringBuffer.append(TEXT_145);
    } else {
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_149);
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genClass.getOffsetCorrectionField(null));
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genClass.getImplementedGenFeatures().get(0).getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genClass.getQualifiedFeatureID(genClass.getImplementedGenFeatures().get(0)));
    stringBuffer.append(TEXT_154);
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) { GenFeature reverseFeature = genFeature.getReverse();
    if (reverseFeature != null && reverseFeature.getGenClass().hasOffsetCorrection()) {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genClass.getOffsetCorrectionField(genFeature));
    stringBuffer.append(TEXT_156);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(reverseFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_159);
    }
    }
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_160);
    if (genModel.isPublicConstructors()) {
    stringBuffer.append(TEXT_161);
    } else {
    stringBuffer.append(TEXT_162);
    }
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_164);
    for (GenFeature genFeature : genClass.getFlagGenFeaturesWithDefault()) {
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_167);
    if (!genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_168);
    }
    stringBuffer.append(TEXT_169);
    }
    stringBuffer.append(TEXT_170);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_171);
    }
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_174);
    }
    if (isImplementation && (genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL || genModel.isDynamicDelegation()) && (genClass.getClassExtendsGenClass() == null || (genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL && !genClass.getClassExtendsGenClass().getGenModel().isDynamicDelegation()))) {
    stringBuffer.append(TEXT_175);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_176);
    }
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size());
    stringBuffer.append(TEXT_178);
    }
    //Class/reflectiveDelegation.override.javajetinc
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_179);
    if (!isImplementation) {
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_182);
    } else {
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_185);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_189);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_191);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_192);
    } else {
    stringBuffer.append(TEXT_193);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_194);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_195);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_196);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_197);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_201);
    }
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_203);
    }
    stringBuffer.append(TEXT_204);
    if (!isImplementation) {
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_206);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_207);
    } else {
    stringBuffer.append(TEXT_208);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_209);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_210);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_212);
    }
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_213);
    }
    stringBuffer.append(TEXT_214);
    if (!isImplementation) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_216);
    } else {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_218);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_220);
    } else {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_222);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_223);
    }
    stringBuffer.append(TEXT_224);
    }
    stringBuffer.append(TEXT_225);
    if (!isImplementation) {
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_228);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_229);
    } else {
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_231);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_237);
    }
    stringBuffer.append(TEXT_238);
    if (!isImplementation) {
    stringBuffer.append(TEXT_239);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_240);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_241);
    } else {
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_245);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_248);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_249);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_250);
    stringBuffer.append(keyFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_251);
    } else {
    stringBuffer.append(TEXT_252);
    stringBuffer.append(keyFeature.getType(genClass));
    stringBuffer.append(TEXT_253);
    }
    stringBuffer.append(TEXT_254);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_255);
    stringBuffer.append(valueFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_256);
    } else {
    stringBuffer.append(TEXT_257);
    stringBuffer.append(valueFeature.getType(genClass));
    stringBuffer.append(TEXT_258);
    }
    stringBuffer.append(TEXT_259);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType(genClass)))) {
String typeName = genFeature.getQualifiedListItemType(genClass); String head = typeName; String tail = ""; int index = typeName.indexOf('<'); if (index == -1) { index = typeName.indexOf('['); } 
if (index != -1) { head = typeName.substring(0, index); tail = typeName.substring(index).replaceAll("<", "&lt;"); }

    stringBuffer.append(TEXT_260);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_261);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_262);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_263);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_264);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_266);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_267);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_269);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_270);
    }
    }
    stringBuffer.append(TEXT_271);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_274);
    }
    stringBuffer.append(TEXT_275);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_277);
    }
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_280);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_283);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_285);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_286);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_288);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_291);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_292);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_293);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_294);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_295);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_296);
    }}
    stringBuffer.append(TEXT_297);
    //Class/getGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_298);
    if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_301);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !(genModel.isReflectiveDelegation() && genModel.isDynamicDelegation()) && genFeature.isUncheckedCast(genClass) || genFeature.isListType() && !genFeature.isFeatureMapType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation() || genModel.isDynamicDelegation()) || genFeature.isListDataType() && genFeature.hasDelegateFeature())) {
    stringBuffer.append(TEXT_302);
    }
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_305);
    }
    stringBuffer.append(TEXT_306);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_307);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_308);
    }
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_312);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_313);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_315);
    }
    stringBuffer.append(TEXT_316);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_317);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_318);
    }
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_321);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_323);
    }
    stringBuffer.append(TEXT_324);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_329);
    }
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_331);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_334);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_335);
    } else {
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_338);
    }
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_340);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_343);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_349);
    }
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_356);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_357);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_361);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_362);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_366);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_367);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_369);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_370);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_373);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_374);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_375);
    }
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_377);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_380);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_382);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_383);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_384);
    }
    stringBuffer.append(TEXT_385);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_388);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_394);
    }
    stringBuffer.append(TEXT_395);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_399);
    } else if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_402);
    } else {
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_407);
    }
    } else {
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_409);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_419);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = isJDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_423);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_424);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_426);
    } else {
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_428);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_429);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_431);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_433);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_435);
    } else {
    stringBuffer.append(TEXT_436);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_438);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_439);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_440);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_442);
    }
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_444);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_446);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_448);
    }
    stringBuffer.append(TEXT_449);
    } else {
    stringBuffer.append(TEXT_450);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_451);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_453);
    }
    stringBuffer.append(TEXT_454);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_456);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_458);
    }
    stringBuffer.append(TEXT_459);
    }
    }
    } else if (genClass.getGetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genClass.getGetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_463);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_464);
    if (genFeature.isMapType()) {
    stringBuffer.append(TEXT_465);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_466);
    } else {
    stringBuffer.append(TEXT_467);
    }
    stringBuffer.append(TEXT_468);
    }
    stringBuffer.append(TEXT_469);
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_470);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_471);
    if (isJDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    }
    stringBuffer.append(TEXT_472);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_474);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_477);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_478);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_479);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_480);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_481);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_482);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_485);
    } else {
    stringBuffer.append(TEXT_486);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_487);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_490);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_492);
    } else {
    stringBuffer.append(TEXT_493);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_494);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_495);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_496);
    }
    } else {
    stringBuffer.append(TEXT_497);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_499);
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_500);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_501);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    }
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_504);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_507);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_511);
    stringBuffer.append(TEXT_512);
    } else if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_515);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_516);
    stringBuffer.append(TEXT_517);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_521);
    } else {
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_527);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_529);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_530);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_531);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_533);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_534);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_536);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_539);
    }
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_541);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_542);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_547);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_550);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_551);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_552);
    } else {
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_554);
    }
    stringBuffer.append(TEXT_555);
    } else {
    stringBuffer.append(TEXT_556);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_559);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_560);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_561);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_565);
    }
    stringBuffer.append(TEXT_566);
    }
    stringBuffer.append(TEXT_567);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_569);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_570);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_571);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_572);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_573);
    } else {
    stringBuffer.append(TEXT_574);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_575);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_577);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_578);
    }
    } else {
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_580);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_581);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_582);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_583);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_586);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_587);
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_590);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_593);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_595);
    }
    }
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_597);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_598);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_599);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_601);
    } else { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_603);
    }
    stringBuffer.append(TEXT_604);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_605);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_606);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_608);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_609);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_610);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_611);
    }
    stringBuffer.append(TEXT_612);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_613);
    }
    stringBuffer.append(TEXT_614);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_616);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_618);
    }
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_620);
    }
    stringBuffer.append(TEXT_621);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_628);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_632);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_634);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_635);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_639);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_644);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_645);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_647);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_648);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_650);
    }
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_652);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_655);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_657);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_661);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_663);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_665);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_667);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_669);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_670);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_671);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_672);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_673);
    }
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_675);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_677);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_678);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_679);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_681);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_682);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_683);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_685);
    }
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_688);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_689);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_691);
    }
    stringBuffer.append(TEXT_692);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_693);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_694);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_695);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_696);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_697);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_698);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_700);
    }
    stringBuffer.append(TEXT_701);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_702);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_704);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_705);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_707);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_708);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_709);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_712);
    } else {
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_716);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_718);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_719);
    }
    }
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_722);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_725);
    } else {
    stringBuffer.append(TEXT_726);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_728);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_730);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_732);
    if (isJDK50) {
    stringBuffer.append(TEXT_733);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_734);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_736);
    }
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_738);
    }
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_739);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_741);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_742);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_746);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_748);
    } else {
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_750);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_752);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_753);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_757);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_758);
    } else {
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_762);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_764);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_766);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_767);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_768);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_771);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_772);
    }
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_775);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_778);
    }
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_780);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_784);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_785);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_788);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_789);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_790);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_791);
    } else {
    stringBuffer.append(TEXT_792);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_793);
    }
    stringBuffer.append(TEXT_794);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_795);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_798);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_803);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_805);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_808);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_809);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_810);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_812);
    }
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_814);
    }
    stringBuffer.append(TEXT_815);
    } else {
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_817);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_819);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_821);
    }
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_823);
    }
    stringBuffer.append(TEXT_824);
    }
    } else if (setAccessorOperation != null) {
    stringBuffer.append(TEXT_825);
    stringBuffer.append(setAccessorOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_826);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_828);
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_829);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_830);
    if (isJDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    }
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_833);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_834);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_836);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_839);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_841);
    }
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_843);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_847);
    }
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_849);
    }
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_851);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_852);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_855);
    }
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_858);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_860);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_861);
    }
    stringBuffer.append(TEXT_862);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_863);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_864);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_867);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_868);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_870);
    } else {
    stringBuffer.append(TEXT_871);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_872);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_873);
    } else {
    stringBuffer.append(TEXT_874);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_875);
    }
    stringBuffer.append(TEXT_876);
    }
    } else {
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_879);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_880);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_885);
    stringBuffer.append(TEXT_886);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_888);
    }
    stringBuffer.append(TEXT_889);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_890);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_891);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_892);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_893);
    }
    stringBuffer.append(TEXT_894);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_895);
    if (isJDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_896);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_897);
    } else {
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingUnsetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_899);
    }
    stringBuffer.append(TEXT_900);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_902);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_903);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_905);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_908);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_910);
    }
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_912);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_913);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_914);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_915);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_916);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_919);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_920);
    }
    stringBuffer.append(TEXT_921);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_922);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_923);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_924);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_925);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_926);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_927);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_928);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_929);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_930);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_931);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_932);
    }
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_934);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_936);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_937);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_938);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_939);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_941);
    }
    stringBuffer.append(TEXT_942);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_944);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_946);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_947);
    }
    stringBuffer.append(TEXT_948);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_949);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_951);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_953);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_954);
    }
    stringBuffer.append(TEXT_955);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_958);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_960);
    } else {
    stringBuffer.append(TEXT_961);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_964);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_967);
    }
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_970);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_974);
    }
    }
    if (!genModel.isSuppressNotification()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_976);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_977);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_978);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_980);
    } else {
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_982);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_983);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_985);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_986);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_988);
    } else {
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_990);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_994);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_996);
    } else {
    stringBuffer.append(TEXT_997);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_998);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_999);
    } else {
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1001);
    }
    stringBuffer.append(TEXT_1002);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1008);
    } else {
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1013);
    }
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1016);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1019);
    } else {
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1021);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1025);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1030);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1031);
    } else {
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1033);
    }
    stringBuffer.append(TEXT_1034);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1039);
    } else {
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1043);
    }
    } else if (genClass.getUnsetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genClass.getUnsetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1047);
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1048);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1056);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1058);
    }
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1060);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1063);
    }
    stringBuffer.append(TEXT_1064);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1065);
    if (isJDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1067);
    } else {
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingIsSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1069);
    }
    stringBuffer.append(TEXT_1070);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1073);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1075);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1080);
    }
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1083);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1085);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1087);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1090);
    } else {
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1092);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1097);
    } else {
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1101);
    }
    } else if (genClass.getIsSetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genClass.getIsSetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1105);
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1106);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(TEXT_1108);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_1109);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_1115);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1118);
    }}
    stringBuffer.append(TEXT_1119);
    //Class/genOperation.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1120);
    if (isJDK50) { //Class/genOperation.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1125);
    } else {
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1130);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1144);
    } else {
    stringBuffer.append(TEXT_1145);
    //Class/implementedGenOperation.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1146);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1147);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_1148);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1149);
    }
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1154);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1156);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1159);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1161);
    } else {
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1163);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1164);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1167);
    } else {
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1169);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1170);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1174);
    } else if (genFeature.isVolatile() || genClass.getImplementingGenModel(genFeature).isDynamicDelegation()) {
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1177);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1179);
    }
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1181);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1185);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1190);
    }
    stringBuffer.append(TEXT_1191);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1193);
    }
    }
    stringBuffer.append(TEXT_1194);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1195);
    } else {
    stringBuffer.append(TEXT_1196);
    }
    stringBuffer.append(TEXT_1197);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1198);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1199);
    }
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1204);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1206);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1211);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1215);
    } else {
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1218);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1220);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1222);
    } else {
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1224);
    }
    }
    stringBuffer.append(TEXT_1225);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1226);
    } else {
    stringBuffer.append(TEXT_1227);
    }
    stringBuffer.append(TEXT_1228);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1229);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1230);
    }
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1234);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1238);
    }
    stringBuffer.append(TEXT_1239);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1240);
    } else {
    stringBuffer.append(TEXT_1241);
    }
    stringBuffer.append(TEXT_1242);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_1243);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1244);
    }
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1246);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1248);
    if (genFeature.isPrimitiveType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1250);
    } else if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1252);
    } else {
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1255);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1258);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1263);
    } else {
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1266);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1270);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1274);
    } else {
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1276);
    }
    }
    stringBuffer.append(TEXT_1277);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1278);
    } else {
    stringBuffer.append(TEXT_1279);
    }
    stringBuffer.append(TEXT_1280);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1281);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass) && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_1282);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1283);
    }
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1285);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1287);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1291);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1294);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1299);
    } else {
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1302);
    }
    } else {
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (isJDK50) {
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1307);
    }
    stringBuffer.append(TEXT_1308);
    }
    } else if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1312);
    } else {
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1314);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1316);
    }
    stringBuffer.append(TEXT_1317);
    }
    stringBuffer.append(TEXT_1318);
    }
    stringBuffer.append(TEXT_1319);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1320);
    } else {
    stringBuffer.append(TEXT_1321);
    }
    stringBuffer.append(TEXT_1322);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_1323);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1324);
    }
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1326);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1328);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1331);
    } else {
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1333);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1335);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_1336);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1338);
    } else {
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1341);
    }
    stringBuffer.append(TEXT_1342);
    }
    stringBuffer.append(TEXT_1343);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1344);
    } else {
    stringBuffer.append(TEXT_1345);
    }
    stringBuffer.append(TEXT_1346);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_1347);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    if (genFeature.isListType() && !genFeature.isUnsettable() && !genFeature.isWrappedFeatureMapType() && !genClass.isField(genFeature) && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1348);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1349);
    }
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1351);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) { String safeNameAccessor = genFeature.getSafeName(); if ("featureID".equals(safeNameAccessor)) { safeNameAccessor = "this." + safeNameAccessor; }
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1353);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1356);
    } else {
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1359);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1362);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1369);
    } else {
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1371);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1373);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1375);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1377);
    } else {
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1379);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1381);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1383);
    } else {
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1385);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1389);
    } else {
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1393);
    }
    } else {
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1396);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1400);
    } else {
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1403);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1408);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1418);
    } else {
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1420);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1423);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1424);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1425);
    } else {
    stringBuffer.append(TEXT_1426);
    }
    stringBuffer.append(TEXT_1427);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1428);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1429);
    }
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1431);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1434);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1437);
    }
    stringBuffer.append(TEXT_1438);
    }
    stringBuffer.append(TEXT_1439);
    }
    stringBuffer.append(TEXT_1440);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1441);
    }
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1443);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1445);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1448);
    }
    stringBuffer.append(TEXT_1449);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1452);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_1453);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1455);
    }
    stringBuffer.append(TEXT_1456);
    }
    stringBuffer.append(TEXT_1457);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_1458);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1459);
    }
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1461);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1462);
    }
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1464);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_1465);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1466);
    }
    stringBuffer.append(TEXT_1467);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1470);
    }
    stringBuffer.append(TEXT_1471);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1472);
    }
    stringBuffer.append(TEXT_1473);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1476);
    }
    stringBuffer.append(TEXT_1477);
    }
    }
    }
    if (!genClass.hasImplementedToStringGenOperation() && isImplementation && !genModel.isReflectiveDelegation() && !genModel.isDynamicDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1478);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1479);
    }
    stringBuffer.append(TEXT_1480);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1483);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1488);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1489);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1491);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1492);
    }
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1496);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1497);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1498);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1499);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1500);
    }
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(genModel.getNonNLS());
    }
    } else {
    stringBuffer.append(TEXT_1506);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1509);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1510);
    }
    stringBuffer.append(TEXT_1511);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_1515);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1516);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1518);
    } else {
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1523);
    }
    } else {
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1525);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1526);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = isJDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = isJDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (isJDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_1529);
    if (!isJDK50 && keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1530);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1531);
    } else {
    stringBuffer.append(TEXT_1532);
    }
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_1534);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_1535);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1537);
    }
    stringBuffer.append(TEXT_1538);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_1539);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1542);
    } else {
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1544);
    }
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_1546);
    if (!isJDK50 && valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1548);
    } else {
    stringBuffer.append(TEXT_1549);
    }
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_1553);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_1554);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1556);
    }
    stringBuffer.append(TEXT_1557);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_1558);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1561);
    } else {
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1563);
    }
    stringBuffer.append(TEXT_1564);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_1565);
    }
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_1569);
    }
    stringBuffer.append(TEXT_1570);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_1571);
    return stringBuffer.toString();
  }
}
