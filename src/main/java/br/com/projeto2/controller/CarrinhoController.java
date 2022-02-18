package br.com.projeto2.controller;

import br.com.projeto2.beans.Cliente;
import br.com.projeto2.beans.Compra;
import br.com.projeto2.beans.Produto;
import br.com.projeto2.repository.ClienteRepository;
import br.com.projeto2.repository.CompraRepository;
import br.com.projeto2.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CarrinhoController {

    @Autowired
    CompraRepository compraR;

    @Autowired
    ProdutoRepository pR;

    @Autowired
    ClienteRepository cR;

    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public String form() {
        return "Carrinho";
    }

    @GetMapping("cart/{id_produto}")
    public ModelAndView addCarinho(@PathVariable("id_produto") Long id){
        ModelAndView mv = new ModelAndView("carrinho");
        Cliente c = this.cR.getById(1L);
        Produto p = this.pR.getById(id);
        Compra cp = new Compra(p,c);
        compraR.save(cp);
        List<Compra> compras= compraR.findByClienteId(1L);
        for(Compra c3: compras){
            System.out.println("ttttt   //////"+c3.getProduto().getCategoria());
            c.getListCarinho().add(c3.getProduto());
        }

        mv.addObject("produtos", c.getListCarinho());
        return mv;
    }
}
