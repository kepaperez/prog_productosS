package API;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

//import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import modelo.bean.Producto;
import modelo.dao.ModeloProducto;

/**
 * Servlet implementation class CrearProducto
 */
@WebServlet("/CrearProducto")
public class CrearProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CrearProducto() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String jsonProducto = request.getParameter("producto");

		JSONObject jsonObject = new JSONObject(jsonProducto);

		Producto producto = new Producto();
		producto.setNombre(jsonObject.getString("nombre"));
		producto.setStock(jsonObject.getInt("stock"));

		Date fecha = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//
		try {
			fecha = sdf.parse(jsonObject.getString("fecha_compra"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		

			producto.setFecha_compra(fecha);
			producto.setColor(jsonObject.getString("color"));
			producto.setMade_in(jsonObject.getString("madeIn"));
			producto.setPrecio(jsonObject.getDouble("precio"));
			producto.setNombre(jsonObject.getString("nombre"));
			producto.setDescuento(jsonObject.getInt("descuento"));
			producto.setTallas(jsonObject.getString("tallas"));

			ModeloProducto modeloProducto = new ModeloProducto();
			modeloProducto.insert(producto);

			try {
				modeloProducto.getConexion().close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			response.setHeader("Access-Control-Allow-Origin", "*");
			response.setCharacterEncoding("UTF-8");
		}

	}

