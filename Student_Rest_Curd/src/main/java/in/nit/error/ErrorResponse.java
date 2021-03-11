package in.nit.error;

public class ErrorResponse {

	private String code;
	private String message;
	public ErrorResponse() {
		System.out.println("ErrorResponse.ErrorResponse()");
	}
	public ErrorResponse(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ErrorResponse [code=" + code + ", message=" + 
				message + "]";
	}
}


