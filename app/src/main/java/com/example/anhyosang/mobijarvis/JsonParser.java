package com.example.anhyosang.mobijarvis;

//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;

public class JsonParser {
//	// JSON 데이터
//	private String everString = "잘못된 명령어 입니다.";
//	public String pString = null;
//	public String aString = null;
//
//	public JsonParser() {
//		Path path = Paths.get("./temp/test.json");
//		String filepath = path.toString();
//		File f = new File(filepath);
//		// 만약 빈파일이라면 종료 한다.
//		if(f.length() == 0)
//			return;
//		BufferedReader br = null;
//		try {
//			br = new BufferedReader(new FileReader(f.getPath()));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("내용이 없습니다.");
//		}
//
//
//
//
//		try {
//			StringBuilder sb = new StringBuilder();
//			String line = br.readLine();
//
//			while (line != null) {
//				sb.append(line);
//				sb.append(System.lineSeparator());
//				line = br.readLine();
//			}
//			everString = sb.toString();
//			System.out.println(everString);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				br.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//		JSONParser jsonParser = new JSONParser();
//		// JSON데이터를 넣어 JSON Object 로 만들어 준다.
//		JSONObject jsonObject = null;
//		try {
//			jsonObject = (JSONObject) jsonParser.parse(everString);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		// books의 배열을 추출
//		JSONArray resultInfoArray = (JSONArray) jsonObject.get("result");
//		JSONObject alternativeObject = (JSONObject) resultInfoArray.get(0);
//		JSONArray alternativeInfoArray = (JSONArray) alternativeObject.get("alternative");
//
//		System.out.println("* TEST JSON *");
//
//		for (int i = 0; i < alternativeInfoArray.size(); i++) {
//
//			// System.out.println("=BOOK_" + i +
//			// " ===========================================");
//			// 배열 안에 있는것도 JSON형식 이기 때문에 JSON Object 로 추출
//			JSONObject transObject = (JSONObject) alternativeInfoArray.get(i);
//			// JSON name으로 추출
//			// System.out.println(i + ": transcript==>" +
//			// transObject.get("transcript"));
//			// System.out.println(i + ": confidence==>" +
//			// transObject.get("confidence"));
//			pString = (String) transObject.get("transcript");
//			if (i == 0) {
//				aString = (String) transObject.get("transcript");
//				if (aString.isEmpty()) {
//					aString = "결과를 찾을수 없습니다.";
//				}
//			}
//
//		}
//
//	}
//
//	/**
//	 * JSON파일에서 가장 정확도가 높은 문자열을 반환한다.
//	 *
//	 * @return 문자열
//	 */
//	public String getParserString() {
//		return aString;
//
//	}
}
