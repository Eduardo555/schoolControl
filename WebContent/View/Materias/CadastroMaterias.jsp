<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<mt:simpletemplate title="Cadastro de Materias">
	<jsp:attribute name="content">
		
		<div class="breadcrumbs">
            <div class="breadcrumbs-inner">
                <div class="row m-0">
                    <div class="col-sm-4">
                        <div class="page-header float-left">
                            <div class="page-title">
                                <h1>Cadastro de Matérias</h1>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-8">
                        <div class="page-header float-right">
                            <div class="page-title">
                                <ol class="breadcrumb text-right">
                                    <li><a href="#">Matérias</a></li>
                                    <li class="active">Listagem</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
		
		<form action="SalvarMaterias" method="post">
		
		<div class="content">
			<div class="row">
				<div class="col-sm-12">
				
					<div class="card">
						<div class="card-body card-block">
						
							<div class="row">
								<div class="col-sm-2">
		                        	<div class="form-group">
										<label for="company" class=" form-control-label">Código</label>
										<input type="text" name="TxtCodigo" id="TxtCodigo" placeholder="0" class="form-control" value="${Materia.CodMateria}">	
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-12">
		                        	<div class="form-group">
										<label for="company" class=" form-control-label">Nome</label>
										<input type="text" name="TxtNome" id="TxtNome" placeholder="0" class="form-control" value="${Materia.CodMateria}">	
									</div>
								</div>
							</div>
							
							<div class="row">
								<div class="col-sm-12">
		                        	<div class="form-group">
										<label for="company" class=" form-control-label">Nome</label>
										<textarea rows="5" cols="5" name="TxtDescricao" id="TxtDescricao" placeholder="0" class="form-control" ></textarea>	
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