<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<mt:simpletemplate title="Cadastro de Alunos">
	<jsp:attribute name="content">
		
		<div class="breadcrumbs">
            <div class="breadcrumbs-inner">
                <div class="row m-0">
                    <div class="col-sm-4">
                        <div class="page-header float-left">
                            <div class="page-title">
                                <h1>Cadastro de Alunos</h1>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-8">
                        <div class="page-header float-right">
                            <div class="page-title">
                                <ol class="breadcrumb text-right">
                                    <li><a href="#">Alunos</a></li>
                                    <li class="active">Cadastro</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
		<form action="SalvarAlunos" method="post">
		<div class="content">
			<div class="row">
				<div class="col-sm-12">
					
					<div class="card">
                        <div class="card-body card-block">
                        		
                        		<div class="row">
                        			<div class="col-sm-6">
	                        			<div class="form-group">
			                                <label for="company" class=" form-control-label">Nome</label>
			                                <input type="text" id="TxtNome" placeholder="Nome do aluno" class="form-control">	
	                                	</div>
                        			</div>
                        		
	                        		<div class="col-sm-3">
	                        			<div class="form-group">
			                                <label for="vat" class=" form-control-label">Data de nascimento</label>
			                                <input type="text" id="TxtDataNascimento" placeholder="99/99/1999" class="form-control">
	                                	</div>
	                        		</div>
	                        		
	                        		<div class="col-sm-3">
	                        			<div class="form-group">
			                                <label for="street" class=" form-control-label">Sexo</label>
			                                <select name="TxtSexo" class="form-control" id="TxtSexo">
											  <option value="">Nenhum</option> 
											  <option value="M">Masculino</option>
											  <option value="F">Feminino</option>
											</select>
		                                </div>
	                        		</div>
	                        		
                        		</div>
                        		
                        		<div class="row">
                        			<div class="col-sm-3">
                        				<div class="form-group">
			                                <label for="street" class=" form-control-label">Cor</label>
			                                <select name="TxtSexo" class="form-control" id="TxtCor">
											  <option value="">Nenhum</option> 
											  <option value="B">Branca</option>
											  <option value="N">Negro</option>
											  <option value="A">Amarelo</option>
											  <option value="P">Pardo</option>
											</select>
		                                </div>
                        			</div>
                        			
                        			<div class="col-sm-3">
                        				<div class="form-group">
			                                <label for="street" class=" form-control-label">Data matrícula</label>
			                                <input type="TxtDataMatricula" id="street" placeholder="99/99/1999" class="form-control">
		                                </div>
                        			</div>
                        			
                        			<div class="col-sm-3">
                        				<div class="form-group">
			                                <label for="street" class=" form-control-label">Status</label>
			                                <select name="TxtSexo" class="form-control" id="TxtStatus">
											  <option value="A">Ativo</option>
											  <option value="I">Inativo</option>
											</select>
		                                </div>
                        			</div>
                        			
                        		</div>
                                
                                <div class="row">
                                	<div class="col-sm-12">
                                		<div class="form-group">
			                                <label for="street" class=" form-control-label">Motivo Desligamento</label>
			                                <textarea id="TxtMotivoDesligamento" class="form-control" rows="5" cols="5"></textarea>
		                                </div>
                                	</div>
                                </div>
                                
                                <div class="row">
                                	<div class="col-sm-3">
                                		<div class="form-group">
			                                <label for="street" class=" form-control-label">Data de desligamento</label>
	                                		<input type="text" id="TxtDataDesligamento" placeholder="20/06/2019" class="form-control">
		                                </div>
                                	</div>
                                </div>
                                
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
			</div>
		</div>
		</form>
		
	</jsp:attribute>
</mt:simpletemplate>
