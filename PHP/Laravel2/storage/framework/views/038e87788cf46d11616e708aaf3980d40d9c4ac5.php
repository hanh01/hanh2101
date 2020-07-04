<?php $__env->startSection('content'); ?>


    <div class="panel-body">


        <?php echo $__env->make('errors.503', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?>


        <form action="<?php echo e(url('task')); ?>" method="post" class="form-horizontal">
            <?php echo e(csrf_field()); ?>


            <div class="form-group">
                <label for="task" class="col-sm-3 control-label">Task</label>
                <div class="col-sm-6">
                    <input type="text" name="name" id="task-name" class="form-control">
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-3 col-sm-6">
                    <button type="submit" class="btn btn-default">
                        <i class="fa fa-plus"></i>Add Task
                    </button>
                    <br/><br/>
                </div>
            </div>
        </form>

        <?php if(count($tasks) > 0): ?>
            <div class="panel panel-default">
                <div class="panel-heading">
                    Current Task
                </div>
                <div class="panel-body">
                    <table class="table table-striped task-table">
                        <thead>
                            <td>Tasks</td>
                            <td>&nbsp:</td>
                        </thead>
                        <tbody>
                            <?php $__currentLoopData = $tasks; $__env->addLoop($__currentLoopData); foreach($__currentLoopData as $task): $__env->incrementLoopIndices(); $loop = $__env->getLastLoop(); ?>
                                <tr>
                                    <td class="table-text">
                                        <div><?php echo e($task->name); ?></div>
                                    </td>
                                    <td>
                                        <form action="/task/<?php echo e($task->id); ?>" method="post">
                                            <?php echo e(csrf_field()); ?>

                                            <?php echo e(method_field('DELETE')); ?>

                                            <button>Delete Task</button>
                                            <input type="hidden" name="method" value="DELETE">
                                        </form>
                                    </td>
                                </tr>
                                <?php endforeach; $__env->popLoop(); $loop = $__env->getLastLoop(); ?>
                        </tbody>
                    </table>
                </div>
            </div>
            <?php endif; ?>
    </div>

    <?php $__env->stopSection(); ?>

<?php echo $__env->make('layouts.app', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?><?php /**PATH C:\Xampp1\htdocs\hanh\resources\views/tasks.blade.php ENDPATH**/ ?>