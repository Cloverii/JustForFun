// Format JSON
import java.util.Scanner;

public class JSONFormater {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		String json = sc.nextLine();
		sc.close();
		int indentation = 0;
		boolean newLine = false, inQuotation = false;
		for (char c : json.toCharArray()) {
			if(c == '\"') inQuotation = !inQuotation;
			if(!inQuotation && (c == '}' || c == ']')) {
				System.out.println("");
				newLine = true;
				indentation -= 4;
			}
			if(newLine) {
				newLine = false;
				for(int i = 0; i < indentation; i++)
					System.out.print(' ');
			}
			System.out.print(c);
			if(!inQuotation) {
				if(c == '{' || c == '[') {
					System.out.println("");
					newLine = true;
					indentation +=4;
				} else if(!inQuotation && (c == ',')) {
					newLine = true;
					System.out.println("");
				} else if(c == ':') {
					System.out.print(' ');
				}
			}
		}
	}
}

//{"results":[{"location":{"id":"WM7B0X53DZW2","name":"重庆","country":"CN","path":"重庆,重庆,中国","timezone":"Asia/Shanghai","timezone_offset":"+08:00"},"daily":[{"date":"2017-03-29","text_day":"阵雨","code_day":"10","text_night":"阵雨","code_night":"10","high":"25","low":"16","precip":"","wind_direction":"无持续风向","wind_direction_degree":"","wind_speed":"10","wind_scale":"2"},{"date":"2017-03-30","text_day":"中雨","code_day":"14","text_night":"阴","code_night":"9","high":"17","low":"15","precip":"","wind_direction":"无持续风向","wind_direction_degree":"","wind_speed":"10","wind_scale":"2"},{"date":"2017-03-31","text_day":"多云","code_day":"4","text_night":"晴","code_night":"0","high":"21","low":"15","precip":"","wind_direction":"无持续风向","wind_direction_degree":"","wind_speed":"10","wind_scale":"2"}],"last_update":"2017-03-28T18:00:00+08:00"}]} 

