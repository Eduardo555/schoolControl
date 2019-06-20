<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<mt:simpletemplate title="Cadastro Turmas">
	<jsp:attribute name="content">
		
		<div class="breadcrumbs">
            <div class="breadcrumbs-inner">
                <div class="row m-0">
                    <div class="col-sm-4">
                        <div class="page-header float-left">
                            <div class="page-title">
                                <h1>Cadastro de Turmas</h1>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-8">
                        <div class="page-header float-right">
                            <div class="page-title">
                                <ol class="breadcrumb text-right">
                                    <li><a href="#">Turmas</a></li>
                                    <li class="active">Cadastro</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
		
		<div class="content">
			<div class="row">
				<div class="col-lg-6">
                    <div class="card">
                        
                        
                        <div class="card-body card-block">
                                <div class="form-group"><label for="company" class=" form-control-label">Nome</label><input type="text" id="company" placeholder="Descrição da turma" class="form-control"></div>
                                <div class="form-group"><label for="vat" class=" form-control-label">Local</label><input type="text" id="vat" placeholder="Informe o local fisico" class="form-control"></div>
                                <div class="form-group"><label for="street" class=" form-control-label">Data Inicio</label><input type="text" id="street" placeholder="Informe a data de inicio" class="form-control"></div>
                            </div>
                        
                        <div class="card-footer">
                            <button type="submit" class="btn btn-success btn-sm">
                                <i class="fa fa-dot-circle-o"></i> SALVAR
                            </button>
                            <button type="reset" class="btn btn-danger btn-sm">
                                <i class="fa fa-ban"></i> EXCLUIR
                            </button>
                            
                            
                        </div>
                    </div>
                </div>
                
                <div class="col-lg-6">
                    <div class="card">
                        
                        
                        <div class="card-body card-block">
                        
                        		<div class="row form-group">
                            	<div class="col-lg-12">
                            	<label for="select" class=" form-control-label">Alunos</label>
                                            <select name="select" id="select" class="form-control">
                                                <option value="0">Selecione...</option>
                                                <option value="1">Option #1</option>
                                                <option value="2">Option #2</option>
                                                <option value="3">Option #3</option>
                                            </select>
                            	</div>
                                    </div>
                        
                                <table class="table">
                                    <thead>
                                        <tr>
                                          <th scope="col">#</th>
                                          <th scope="col">First</th>
                                          <th scope="col">Last</th>
                                          <th scope="col">Handle</th>
                                      </tr>
                                  </thead>
                                  <tbody>
                                    <tr>
                                        <th scope="row">1</th>
                                        <td>Mark</td>
                                        <td>Otto</td>
                                        <td>@mdo</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">2</th>
                                        <td>Jacob</td>
                                        <td>Thornton</td>
                                        <td>@fat</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">3</th>
                                        <td>Larry</td>
                                        <td>the Bird</td>
                                        <td>@twitter</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">3</th>
                                        <td>Larry</td>
                                        <td>the Bird</td>
                                        <td>@twitter</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">3</th>
                                        <td>Larry</td>
                                        <td>the Bird</td>
                                        <td>@twitter</td>
                                    </tr>
                                </tbody>
                            </table>
                                
                            	
                            </div>
                        
                        
                    </div>
                </div>
                
			</div>
		</div>
		
		
		
	</jsp:attribute>
</mt:simpletemplate>