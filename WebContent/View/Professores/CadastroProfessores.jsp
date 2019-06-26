<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<mt:simpletemplate title="Cadastro de Professores">
	<jsp:attribute name="content">
		
		<div class="breadcrumbs">
            <div class="breadcrumbs-inner">
                <div class="row m-0">
                    <div class="col-sm-4">
                        <div class="page-header float-left">
                            <div class="page-title">
                                <h1>Cadastro de Professores</h1>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-8">
                        <div class="page-header float-right">
                            <div class="page-title">
                                <ol class="breadcrumb text-right">
                                    <li><a href="#">Professores</a></li>
                                    <li class="active">Cadastro</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
		
		<form action="SalvarProfessores" method="post">
		
		<div class="content">
			<div class="row">
				<div class="col-sm-12">
				
				<div class="card">
					<div class="card-body card-block">
						
						<div class="row">
                        	<div class="col-sm-6">
	                        	<div class="form-group">
									<label for="company" class=" form-control-label">Código</label>
									<input type="text" name="TxtCodigo" id="TxtCodigo" placeholder="0" class="form-control" value="${Professor.CodProfessor}">	
								</div>
							</div>
						</div>
						
						<div class="row">
                        	<div class="col-sm-4">
	                        	<div class="form-group">
									<label for="company" class=" form-control-label">Nome</label>
									<input type="text" name="TxtNome" id="TxtNome" placeholder="0" class="form-control" value="${Professor.Nome}">	
								</div>
							</div>
							<div class="col-sm-3">
								<div class="form-group">
									<label for="vat" class=" form-control-label">Data de nascimento</label>
									<input type="text" name="TxtDataNascimento" id="TxtDataNascimento" placeholder="99/99/1999" class="form-control">
								</div>
							</div>
							<div class="col-sm-3">
								<div class="form-group">
									<label for="vat" class=" form-control-label">Data de admissão</label>
									<input type="text" name="TxtDataAdimissao" id="TxtDataAdimissao" placeholder="99/99/1999" class="form-control">
								</div>
							</div>
							<div class="col-sm-2">
								<div class="form-group">
									<label for="street" class=" form-control-label">Grau escolaridade</label>
									<select name="TxtSexo" class="form-control" id="TxtSexo">
										<option value="0">Nenhum</option> 
										<option value="1">1 Grau</option>
										<option value="2">2 Grau</option>
										<option value="3">3 Grau</option>
									</select>
								</div>
	                        </div>
						</div>
						
						<div class="row">
							<div class="col-sm-4">
	                        	<div class="form-group">
									<label for="company" class=" form-control-label">Email</label>
									<input type="text" name="TxtEmail" id="TxtEmail" placeholder="0" class="form-control" value="${Professor.Email}">	
								</div>
							</div>
							<div class="col-sm-4">
								<div class="form-group">
									<label for="street" class=" form-control-label">Sexo</label>
									<select name="TxtSexo" class="form-control" id="TxtSexo">
										<option value="">Nenhum</option> 
										<option value="M">Masculino</option>
										<option value="F">Feminino</option>
									</select>
								</div>
	                       	</div>
							<div class="col-sm-4">
	                        	<div class="form-group">
									<label for="company" class=" form-control-label">Telefone</label>
									<input type="text" name="TxtTelefone" id="TxtTelefone" placeholder="0" class="form-control" value="${Professor.Email}">	
								</div>
							</div>
						</div>
						
						<div class="row">
							<div class="col-sm-3">
	                        			<div class="form-group">
			                                <label for="street" class=" form-control-label">Materia</label>
			                                <select name="TxtMateria" class="form-control" id="TxtMateria">
											  <option value="">Nenhum</option> 
											  <option value="M">POrtugues</option>
											  <option value="F">Matematica</option>
											</select>
		                                </div>
	                        		</div>
						</div>
						
					</div>
					<div class="card-footer">
                            <input type="submit" class="btn btn-success btn-sm" value="SALVAR" />
                            <input type="submit" class="btn btn-danger btn-sm" value="EXCLUIR" />
                        </div>
				</div>
				
				</div>
			</div>
		</div>
		
		</form>
		
	</jsp:attribute>
</mt:simpletemplate>
