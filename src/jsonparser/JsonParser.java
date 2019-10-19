/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonparser;

import com.praxis.video.model.Bookmark;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import jsonparser.model.Client;
import jsonparser.model.ClientEmail;
import jsonparser.model.Course;
import jsonparser.model.Lecture;
import jsonparser.model.Student;
import jsonparser.model.StudentLogDetails;
import jsonparser.model.StudentMachineDetail;
import org.reflections.Reflections;

/**
 *
 * @author rahul-ubuntu
 */
public class JsonParser {

    private static String PACKAGE_NAME = "jsonparser.mpmodel";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        buildCourseSetters();
//        buildLectureSetters();
//        buildBookmarkSetters();
//        buildMachineDetailSetters();
//        buildLogDetailSetters();
//        buildClientSetters();
//        buildStudentSetters();

        buildMediaPlayerModelParser();

    }

    private static void buildCourseSetters() {
        StringBuilder sb = new StringBuilder();

        Class cls = Course.class;
        Method[] methods = cls.getMethods();

        for (Method method : methods) {
            if (method.getName().startsWith("set")) {
                String paramName = method.getName().substring(3);
                String s1 = paramName.substring(0, 1).toLowerCase();
                paramName = s1 + paramName.substring(1);

                if (method.getParameterTypes()[0].equals(String.class)) {
                    sb.append("course." + method.getName() + "(data.optString(\"" + paramName + "\",null)); \n");
                } else if (method.getParameterTypes()[0].equals(int.class)) {
                    sb.append("course." + method.getName() + "(data.getInt(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(boolean.class)) {
                    sb.append("course." + method.getName() + "(data.getBoolean(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(Date.class)) {
                    sb.append("course." + method.getName() + "(stringToJavaDate(data.optString(\"" + paramName + "\"))); \n");
                }
            }
        }
        System.out.println(sb.toString());
        System.out.println("===***====");
    }

    private static void buildLectureSetters() {
        StringBuilder sb = new StringBuilder();

        Class cls = Lecture.class;
        Method[] methods = cls.getMethods();

        for (Method method : methods) {
            if (method.getName().startsWith("set")) {
                String paramName = method.getName().substring(3);
                String s1 = paramName.substring(0, 1).toLowerCase();
                paramName = s1 + paramName.substring(1);

                if (method.getParameterTypes()[0].equals(String.class)) {
                    sb.append("lecture." + method.getName() + "(data.getString(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(int.class)) {
                    sb.append("lecture." + method.getName() + "(data.getInt(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(boolean.class)) {
                    sb.append("lecture." + method.getName() + "(data.getBoolean(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(Date.class)) {
                    sb.append("lecture." + method.getName() + "(stringToJavaDate(data.getString(\"" + paramName + "\"))); \n");
                }
            }
        }
        System.out.println(sb.toString());
        System.out.println("===***====");
    }

    private static void buildBookmarkSetters() {
        StringBuilder sb = new StringBuilder();

        Class cls = Bookmark.class;
        Method[] methods = cls.getMethods();

        for (Method method : methods) {
            if (method.getName().startsWith("set")) {
                String paramName = method.getName().substring(3);
                String s1 = paramName.substring(0, 1).toLowerCase();
                paramName = s1 + paramName.substring(1);

                if (method.getParameterTypes()[0].equals(String.class)) {
                    sb.append("bookmark." + method.getName() + "(data.getString(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(int.class)) {
                    sb.append("bookmark." + method.getName() + "(data.getInt(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(boolean.class)) {
                    sb.append("bookmark." + method.getName() + "(data.getBoolean(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(Date.class)) {
                    sb.append("bookmark." + method.getName() + "(stringToJavaDate(data.getString(\"" + paramName + "\"))); \n");
                }
            }
        }
        System.out.println(sb.toString());
        System.out.println("===***====");
    }

    private static void buildMachineDetailSetters() {
        StringBuilder sb = new StringBuilder();

        Class cls = StudentMachineDetail.class;
        Method[] methods = cls.getMethods();

        for (Method method : methods) {
            if (method.getName().startsWith("set")) {
                String paramName = method.getName().substring(3);
                String s1 = paramName.substring(0, 1).toLowerCase();
                paramName = s1 + paramName.substring(1);

                if (method.getParameterTypes()[0].equals(String.class)) {
                    sb.append("machine." + method.getName() + "(data.getString(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(int.class)) {
                    sb.append("machine." + method.getName() + "(data.getInt(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(boolean.class)) {
                    sb.append("machine." + method.getName() + "(data.getBoolean(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(Date.class)) {
                    sb.append("machine." + method.getName() + "(stringToJavaDate(data.getString(\"" + paramName + "\"))); \n");
                }
            }
        }
        System.out.println(sb.toString());
        System.out.println("===***====");
    }

    private static void buildLogDetailSetters() {
        StringBuilder sb = new StringBuilder();

        Class cls = StudentLogDetails.class;
        Method[] methods = cls.getMethods();

        for (Method method : methods) {
            if (method.getName().startsWith("set")) {
                String paramName = method.getName().substring(3);
                String s1 = paramName.substring(0, 1).toLowerCase();
                paramName = s1 + paramName.substring(1);

                if (method.getParameterTypes()[0].equals(String.class)) {
                    sb.append("log." + method.getName() + "(data.getString(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(int.class)) {
                    sb.append("log." + method.getName() + "(data.getInt(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(boolean.class)) {
                    sb.append("log." + method.getName() + "(data.getBoolean(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(Date.class)) {
                    sb.append("log." + method.getName() + "(stringToJavaDate(data.getString(\"" + paramName + "\"))); \n");
                }
            }
        }
        System.out.println(sb.toString());
        System.out.println("===***====");
    }

    private static void buildClientSetters() {
        StringBuilder sb = new StringBuilder();

        Class cls = Client.class;
        Method[] methods = cls.getMethods();

        for (Method method : methods) {
            if (method.getName().startsWith("set")) {
                String paramName = method.getName().substring(3);
                String s1 = paramName.substring(0, 1).toLowerCase();
                paramName = s1 + paramName.substring(1);

                if (method.getParameterTypes()[0].equals(String.class)) {
                    sb.append("client." + method.getName() + "(resultSet.getString(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(int.class)) {
                    sb.append("client." + method.getName() + "(resultSet.getInt(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(boolean.class)) {
                    sb.append("client." + method.getName() + "(resultSet.getBoolean(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(Date.class)) {
                    sb.append("client." + method.getName() + "(stringToJavaDate(data.getString(\"" + paramName + "\"))); \n");
                }
            }
        }
        System.out.println(sb.toString());
        System.out.println("===***====");
    }

    private static void buildStudentSetters() {
        StringBuilder sb = new StringBuilder();

        Class cls = Student.class;
        Method[] methods = cls.getMethods();

        for (Method method : methods) {
            if (method.getName().startsWith("set")) {
                String paramName = method.getName().substring(3);
                String s1 = paramName.substring(0, 1).toLowerCase();
                paramName = s1 + paramName.substring(1);

                if (method.getParameterTypes()[0].equals(String.class)) {
                    sb.append("student." + method.getName() + "(resultSet.getString(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(int.class)) {
                    sb.append("student." + method.getName() + "(resultSet.getInt(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(boolean.class)) {
                    sb.append("student." + method.getName() + "(resultSet.getBoolean(\"" + paramName + "\")); \n");
                } else if (method.getParameterTypes()[0].equals(Date.class)) {
                    sb.append("student." + method.getName() + "(stringToJavaDate(data.getString(\"" + paramName + "\"))); \n");
                }
            }
        }
        System.out.println(sb.toString());
        System.out.println("===***====");
    }

    private static void buildMediaPlayerModelParser() {
        StringBuilder sb = new StringBuilder();
        sb.append("package com.praxislogica.mp.http;\n");
        sb.append("import java.text.ParseException;\n"
                + "import java.text.SimpleDateFormat;\n"
                + "import java.util.ArrayList;\n"
                + "import java.util.Date;\n"
                + "import java.util.List;\n"
                + "import java.util.logging.Level;\n"
                + "import java.util.logging.Logger;\n"
                + "import org.json.JSONArray;\n"
                + "import org.json.JSONException;\n"
                + "import org.json.JSONObject;"
                + "import jsonparser.mpmodel.*;\n");
        sb.append("public class HttpJsonResponseParser{\n");

        try {

            List<String> allClasses = getClasses();
            for (String className : allClasses) {
                Class cls = null;

                cls = Class.forName(className);

                Method[] methods = cls.getMethods();
                String clasShortName = className.substring(className.lastIndexOf(".") + 1);

                String objParseMethod = "parse" + clasShortName + "Object";
                String parseMethodName = "public ResponseObject<" + clasShortName + "> parse" + clasShortName + "Response(String jsonString){";
                String respObj = "ResponseObject<" + clasShortName + "> response = new ResponseObject<>();";
                String parserBody = " try {\n"
                        + "            JSONObject responseJson = new JSONObject(jsonString);\n"
                        + "            response.setResponseCode(responseJson.getInt(\"responseCode\"));\n"
                        + "            response.setResponseDesc(responseJson.getString(\"responseDesc\"));\n"
                        + "            response.setData(" + objParseMethod + "(responseJson.getJSONObject(\"data\")));\n"
                        + "\n"
                        + "        } catch (JSONException ex) {\n"
                        + "            Logger.getLogger(HttpJsonResponseParser.class.getName()).log(Level.SEVERE, null, ex);\n"
                        + "        } "
                        + "return response;"
                        + "}";
                sb.append(parseMethodName).append(respObj).append(parserBody);
                sb.append("\n");
                String parseObjectMethod = "public " + clasShortName + " " + objParseMethod + "(JSONObject jsonObject){";
                sb.append(parseObjectMethod);
                String objInitString = clasShortName + " " + clasShortName.toLowerCase() + " = new " + clasShortName + "();";
                sb.append(objInitString);

                sb.append("try {");

                for (Method method : methods) {
                    if (method.getName().startsWith("set")) {
                        String paramName = method.getName().substring(3);
                        String s1 = paramName.substring(0, 1).toLowerCase();
                        paramName = s1 + paramName.substring(1);

                        if (method.getParameterTypes()[0].equals(String.class)) {
                            sb.append(clasShortName.toLowerCase() + "." + method.getName() + "(jsonObject.optString(\"" + paramName + "\")); \n");
                        } else if (method.getParameterTypes()[0].equals(int.class)) {
                            sb.append(clasShortName.toLowerCase() + "." + method.getName() + "(jsonObject.getInt(\"" + paramName + "\")); \n");
                        } else if (method.getParameterTypes()[0].equals(boolean.class)) {
                            sb.append(clasShortName.toLowerCase() + "." + method.getName() + "(jsonObject.getBoolean(\"" + paramName + "\")); \n");
                        } else if (method.getParameterTypes()[0].equals(Date.class)) {
                            sb.append(clasShortName.toLowerCase() + "." + method.getName() + "(stringToJavaDate(jsonObject.optString(\"" + paramName + "\"))); \n");
                        }

                        for (String cn : allClasses) {
                            if (method.getParameterTypes()[0].equals(Class.forName(cn))) {
                                sb.append(clasShortName.toLowerCase() + "." + method.getName() + "(parse" + cn.substring(cn.lastIndexOf(".") + 1) + "Object(jsonObject.getJSONObject(\"" + paramName + "\"))); \n");
                            }
                        }

                        Type[] genericParameterTypes = method.getGenericParameterTypes();

                        for (Type genericParameterType : genericParameterTypes) {

                            if (!genericParameterType.getTypeName().equals("java.util.List<T>")) {
                                continue;
                            }

//                            System.out.println("Generic Type = " + genericParameterType.getTypeName());
//                            System.out.println(method.getParameters()[0].getName());
//                            System.out.println(method.getParameters()[0].toString());
//
//                            Class<?>[] pType = method.getParameterTypes();
//                            Type[] gpType = method.getGenericParameterTypes();
//                            for (int i = 0; i < pType.length; i++) {
//                                System.out.println( "ParameterType"+ pType[i]);
//                                System.out.println("GenericParameterType"+ gpType[i]);
//                            }
//                            if (genericParameterType instanceof ParameterizedType) {
//                                ParameterizedType aType = (ParameterizedType) genericParameterType;
//
//                                Type[] parameterArgTypes = aType.getActualTypeArguments();
//                                for (Type parameterArgType : parameterArgTypes) {
//                                    Class parameterArgClass = (Class) parameterArgType;
//                                    System.out.println("parameterArgClass = " + parameterArgClass);
//                                }
//                            }
                        }

                    }
                }
                sb.append("return " + clasShortName.toLowerCase() + ";");
                sb.append(" } catch (JSONException ex) {\n"
                        + "            Logger.getLogger(HttpJsonResponseParser.class.getName()).log(Level.SEVERE, null, ex);\n"
                        + "        }");
                sb.append("return " + clasShortName.toLowerCase() + ";");
                sb.append("}");
                sb.append("\n");
//                System.out.println(sb.toString());
//                System.out.println("===***====");
            }

            sb.append("\n");
            sb.append(getStringToJavaDateCode());
            sb.append("}");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JsonParser.class.getName()).log(Level.SEVERE, null, ex);
        }

        parserFileWriter(sb.toString());
    }

    private static List<String> getClasses() {
        File[] classes = new File("./src/jsonparser/mpmodel/").listFiles();
        List<String> allClasses = new ArrayList<>();
        if (classes != null && classes.length > 0) {
            for (File f : classes) {
                String className = "jsonparser.mpmodel." + f.getName().substring(0, f.getName().lastIndexOf("."));
                allClasses.add(className);
            }
        }
        return allClasses;
    }

    private static String getStringToJavaDateCode() {
        return "private Date stringToJavaDate(String strDate) {\n"
                + "        if (strDate == null || strDate.equals(\"null\") || strDate.equals(\"\")) {\n"
                + "            return null;\n"
                + "        }\n"
                + "        SimpleDateFormat sdf = new SimpleDateFormat(\"dd-MM-yyyy\");\n"
                + "        try {\n"
                + "            return sdf.parse(strDate);\n"
                + "        } catch (ParseException e) {\n"
                + "            e.printStackTrace();\n"
                + "            return null;\n"
                + "        }\n"
                + "\n"
                + "    }";
    }

    private static void parserFileWriter(String toWrite) {
        File jsonParserJavaClass = new File("./src/jsonparser/HttpJsonResponseParser.java");
        try {
            jsonParserJavaClass.createNewFile();
            Files.write(jsonParserJavaClass.toPath(), toWrite.getBytes());

        } catch (IOException ex) {
            Logger.getLogger(JsonParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
