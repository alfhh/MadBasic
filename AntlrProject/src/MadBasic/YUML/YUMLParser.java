package MadBasic.YUML;

import MadBasic.Algrebra.Variable;
import MadBasic.Semantic.Methods.Function;
import MadBasic.Semantic.Methods.Procedure;
import MadBasic.Semantic.Class;
import MadBasic.Semantic.Types.Type;
import MadBasic.Semantic.Types.TypeArray;
import MadBasic.Semantic.Types.TypeObject;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by lsanchez on 4/30/16.
 */
public class YUMLParser {
    BufferedWriter bufferedWriter;

    public YUMLParser() {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("uml-diagram.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void makeDiagram(HashMap<String, Class> classHashMap) {
        String diagram = "";
        String conns = "";
        for (Class c : classHashMap.values()) {
            if (c.getParent() != null) {
                conns += "[" + c.getParent().getName() + "]^-[" + c.getName() + "],\n";
            }
            String vars = "";
            Set<String> vks = c.getScope().getVariableHashMap().keySet();
            Object[] varsk = vks.toArray();
            for (Object vark : varsk) {
                if (!c.getScope().getProcedureHashMap().containsKey(vark) && (c.getParent() == null ||
                        (!c.getParent().getScope().getVariableHashMap().containsKey(vark)))) {
                    Variable v = c.getScope().getVariableHashMap().get(vark);
                    if (v.getType() instanceof TypeObject) {
                        conns += "[" + c.getName() + "]->[" + ((TypeObject) v.getType()).getClasse().getName() + "],\n";
                    } else if (v.getType() instanceof TypeArray &&
                            ((TypeArray) v.getType()).getType() instanceof TypeObject) {
                        conns += "[" + c.getName() + "]->*[" +
                                ((TypeObject) ((TypeArray) v.getType()).getType()).getClasse().getName() + "],\n";
                    } else {
                        vars += v.getID() + ":" +
                                v.getType().toString().toLowerCase().replace(",", "-").
                                        replace("[", "(").replace("]", ")") + ";";
                    }
                }
            }
            if (vars.length() > 0) {
                vars = vars.substring(0, vars.length() - 1);
            }

            String procs = "";
            Set<String> pks = c.getScope().getProcedureHashMap().keySet();
            Object[] procsk = pks.toArray();
            for (Object prock : procsk) {
                if (prock == "init" || c.getParent() == null || !c.getParent().getScope().getProcedureHashMap().containsKey(prock)) {
                    Procedure proc = c.getScope().getProcedureHashMap().get(prock);
                    String params = "";
                    for (Variable param : proc.getParams()) {
                        if (param.getType() instanceof TypeObject) {
                            params += param.getID() + ":" + ((TypeObject) param.getType()).getClasse().getName() + ";";
                        } else {
                            params += param.getID() + ":" +
                                    param.getType().toString().toLowerCase().replace(",", "-").
                                            replace("[", "(").replace("]", ")") + " : ";
                        }
                    }
                    if (params.length() > 2) {
                        params = params.substring(0, params.length() - 3);
                    }
                    if (proc instanceof Function && ((Function) proc).getType() instanceof TypeObject) {
                        procs += proc.getID() + ":" + ((TypeObject) ((Function) proc).getType()).getClasse().getName() + ";";
                    } else {
                        procs += proc.getID() + ":" +
                                (proc instanceof Function ?
                                        ((Function) proc).getType().toString().toLowerCase() : "void") +
                                "(" + params + ");";
                    }
                }
            }
            if (procs.length() > 0) {
                procs = procs.substring(0, procs.length() - 1);
            }

            diagram += "[" + c.getName() + "|" + vars + "|" + procs + "],\n";
        }

        if (conns.length() > 1) {
            conns = conns.substring(0, conns.length() - 2);
        } else {
            if (diagram.length() > 1) {
                diagram = diagram.substring(0, diagram.length() - 2);
            }
        }
        System.out.println(diagram);
        System.out.println(conns);
        try {
            bufferedWriter.write(diagram);
            bufferedWriter.write(conns);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createDiagram() {
        try {
            String cmd = "yuml -i uml-diagram.txt -o diagram.pdf -f pdf -t class -s plain";
            Runtime run = Runtime.getRuntime();
            Process pr = run.exec(cmd);
            pr.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void runDiagram() {
        try {
            String cmd = "evince diagram.pdf";
            Runtime run = Runtime.getRuntime();
            Process pr = run.exec(cmd);
//            pr.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
